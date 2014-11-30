package com.productapi

import grails.rest.Resource

@Resource(uri="/products", formats=['json', 'xml'])
class Product {

	String category
	String description
	String name
	Float price
	String productNumber
	
    static constraints = {
		
		
		
    }
}
