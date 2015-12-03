var m = Model(
    Section("relations") has (
        Class("User") relatesTo (Class("Visit") has Min(1)),
        Class("Visit") relatesTo (
            Class("Store") relatesTo (
                Class("Visit") has Min(1),
                Class("Product") has Min(1)
            )
        ), Section("attributes") has (
            Class("User") has (
                    Member("shoppinglist"), 
                    Member("user-position"),
                    Member("car-position")
            ), Class("Visit") has (
                    Member("stayId"),  
                    Member("date")
            ), Class("Store") has (
                    Member("name"),
                    Member("offers"), 
                    Member("position"),  
                    Member("rating")
            ), Class("Product") has (
                    Member("name"), 
                    Member("price"), 
                    Member("stockBalance")
            )
        )
    )
)