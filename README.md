## Automation tests for www.etsy.com

#### Link to the page - [www.etsy.com](https://www.etsy.com)

1. Create Collection: `Account Profile`
   - Click account menu button;
   - Select view your account button;
   - Close pop up window;
   - Click "Create collection" button (+);
   - Enter collection name;
   - Click "Create collection" button;

   Expected result: List of collections should contain newly created collection.
2. Update account preferences: `Account Profile`
   - Click account menu button;
   - Select account settings button;
   - Click "Preferences" tab;
   - Select currency - EUR;
   - Click on "Receive Postal Mail" checkbox;
   - Click on "Receive Phone Calls" checkbox;
   - Click "Update Preferences" button;

   Expected result: Should be given a message for successful update and chosen options should be saved. 

3. Add product to cart: `Cart page`
    - Click on product;
    - Select primary color - "Rose Gold";
    - Select number of bars - "1 Heart No Bar";
    - Enter personalization information - "Heart: Flower";
    - Click "Add to cart" button;
    - Click "Create collection" button;

   Expected result: Product should be added to cart with chosen preferences.
4. Filter products with sale: `Clothing&Shoes page`
    - Click "All Filters" button;
    - Click on "On Sale" checkbox;
    - Click "Apply" button;
   
   Expected result: Shown products should be listed as on sale.
5. Search for a product: `Home page`
    - Enter search object - "Golden Rings";
    - Click "Search" button; 

   Expected result: Shown products should include anything from "Golden rings".
6. Sort products by lowest price: `Vintage page`
   - Click "Sort By" button;
   - Select "Lowest price";

   Expected result: Shown products should be sorted from the lowest price and up.