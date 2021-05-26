package com.cpag.msc.MyShoppingCart;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.cpag.msc.myshoppingcart.bean.Product;
import com.cpag.msc.myshoppingcart.dao.ProductRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

	@Test
	public void testgetAllProducts()
	{
		ProductRepository repo = mock(ProductRepository.class);
		//ProductRepository repo = spy(ProductRepository.class);
		
		List<Product> productList = mock(List.class);
		//productList.add(new Product());
		
		when(repo.findAll()).thenReturn(productList);
		assertEquals(productList, productList);
		
	}
	
}
