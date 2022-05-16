package com.example.icartfinal

import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import org.junit.Assert.*
import org.junit.Before

class ProductsActivityTest {

    @RelaxedMockK
    private lateinit var product: Product

    lateinit var productAdapter: ProductAdapter

    lateinit var productActivity: ShoppingListActivity

    @Before
    fun onBefore(){
        MockKAnnotations.init(this)
        //productAdapter = ProductAdapter(productActivity.)
    }
}