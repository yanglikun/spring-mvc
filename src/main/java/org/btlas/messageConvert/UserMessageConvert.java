package org.btlas.messageConvert;

import org.btlas.vo.User;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanglikun on 2016/8/23.
 */
public class UserMessageConvert implements HttpMessageConverter<User> {


    private static Charset defaultCharset = Charset.forName("utf-8");

    private static MediaType userMediaType = MediaType.valueOf("application/user");


    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return User.class.equals(clazz) && userMediaType.isCompatibleWith(mediaType);
    }

    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
        return User.class.equals(clazz) && (mediaType == null || userMediaType.isCompatibleWith(mediaType));
    }

    public List<MediaType> getSupportedMediaTypes() {
        ArrayList<MediaType> mediaTypes = new ArrayList<MediaType>();
        mediaTypes.add(userMediaType);
        return mediaTypes;
    }

    public User read(Class<? extends User> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        String reqStr = StreamUtils.copyToString(inputMessage.getBody(), defaultCharset);
        String[] split = reqStr.split(",");
        User user = new User();
        user.setName(split[0]);
        user.setAge(Integer.valueOf(split[1]));
        return user;
    }

    public void write(User user, MediaType contentType, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        StreamUtils.copy("自定义返回:" + user, defaultCharset, outputMessage.getBody());
    }
}
