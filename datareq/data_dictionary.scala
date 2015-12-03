var m = Model(
    Class("User") has (
        Spec("The user is a person that visits the mall and uses the product shopMate."),
        Example("(1) An user visiting the mall looking for clothes. (2) An user looking for their parked car. (3) An user that wants to fika"),
        Member("shoppinglist") has (
            Spec("A list containing items, where each item is a text attribute, 50 chars. ")),
        Member("user-position") has (
            Spec("The 'user-position' is the current position of the user in the mall."),
            Member("level") has (
                Spec("Integer. The current level the user is on. Obtained using beacons.")),
            Member("coordinate") has (
                Spec("Two doubles. Longitude and latitude."))
            ),
        Member("car-position") has (
            Spec("The 'car-position' is the position of the parked car."),
            Member("level") has (
                Spec("Integer. The current level the car is on. Obtained using beacons.")),
            Member("coordinate") has (
                Spec("Two doubles. Longitude and latitude."))
            )
    ),
    Class("Store") has (
        Spec("A physical store in the mall"),
        Example("(1) A store selling clothing. (2) A store selling services. (3) A store selling food (restaurant)."), 
        Member("name") has (
            Spec("Text attribute, 50 chars. The name of the store. ")),
        Member("offers") has (
            Spec("A list containing offer-id, where each offer-id is a text attribute, 50 chars.")), 
        Member("position") has (
            Spec("The 'position' is the position of the entrance to the store."),
            Member("level") has (
                Spec("Integer attribute. The current level the store is on. Obtained using beacons.")),
            Member("coordinate") has (
                Spec("Two double attributes. Longitude and latitude."))),  
        Member("rating") has (
            Spec("Double. Store rating ranging from 0 - 5.")
        )
    ),
    Class("Product") has (
        Spec("In relation with store. A store has products."),
        Example("(1) Clothes, for example a t-shirt. (2) A hardware item, like a screwdriver."),
        Member("name") has (
            Spec("Text attribute, 50 chars. The name of the product.")), 
        Member("price") has (
            Spec("Integer attribute. In Swedish kronors")), 
        Member("stockBalance") has (
            Spec("Integer attribute. Number of items in stock."))
    )
)
