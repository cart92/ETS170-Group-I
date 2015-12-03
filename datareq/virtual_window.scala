var m = Model(
    Data("createStore") has (
        Spec("The product shall store store-data according to virtual window 'create store data'."),
        Image("vw_store.png")
    ),
    Data("createProduct") has (
        Spec("The product shall store product-data according to virtual window 'create product data'."),
        Image("vw_product.png")
    ),
    Data("createUser") has (
        Spec("The product shall store user-data according to virtual window 'create user data'. User position is continuously updated during use of the product."),
        Image("vw_user.png")
    )
)