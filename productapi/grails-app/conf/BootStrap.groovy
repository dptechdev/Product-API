import com.productapi.Product

class BootStrap {

  
   def init = { servletContext ->
		new Product(category: "Watersports", description: "A boat for one person", name: "Kayak", price: 275, productNumber: "05af70919155f8fc").save()
		new Product(category: "Watersports", description: "Protective and fashionable", name: "Lifejacket", price: 48.95, productNumber: "3d31d81b218c9ef").save()
		new Product(category: "Soccer", description: "FIFA-approved size and weight", name: "Soccer Ball", price: 19.5, productNumber: "93c9cc08ac2f28d4").save()
		new Product(category: "Soccer", description: "Give your playing field a professional touch", name: "Corner Flags", price: 34.95, productNumber: "93c9cc08ac2f28d4").save()
		new Product(category: "Soccer", description: "Flat packed 35,000-seat stadium", name: "Stadium", price: 795000, productNumber: "ad4e64b38baa088f").save()
		new Product(category: "Chess", description: "Improve your brain efficiency by 75%", name: "Thinking Cap", price: 16, productNumber: "b9e8e55c1ecc0b63").save()
		new Product(category: "Chess", description: "Secretly give your opponent a disadvantage", name: "Unsteady Chair", price: 29.95, productNumber: "32c2355f9a617bbd").save()
		new Product(category: "Chess", description: "A fun game for the family", name: "Human Chess Board", price: 75, productNumber: "5241512218f73a26").save()
		new Product(category: "Chess", description: "Gold-plated, diamond-studded King", name: "Bling-Bling King", price: 1200, productNumber: "59166228d70f8858").save()
		
		
    }
    def destroy = {
    }
}
