package org.btlas.jdbc;

public interface CustomerDAO
{
    public void insert(Customer customer);

	public Customer findByCustomerId(int id);
}