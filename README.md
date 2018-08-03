# InventoryApp2

This App focuses on UI that allows users to add and remove products from the inventory, 
review details about a particular product, and see all the currently available products in stock.
This app uses a ContentProvider backed by a SQLite database. This ContentProvider is updated 
whenever changes are made to the database.

The app contains activities for the user to:

  1. Add Inventory:
   
   ![newitemonegif](https://user-images.githubusercontent.com/29640816/43659943-c793f09a-971a-11e8-929e-cbdf2cf76452.gif)
   ![newitem2gif](https://user-images.githubusercontent.com/29640816/43660436-3ab84a66-971c-11e8-8cc3-05f5c4618f97.gif)
   
  2. See Product Details:
  
  ![itemdetailsgif](https://user-images.githubusercontent.com/29640816/43660789-3c8ef7ee-971d-11e8-9228-ed36254d4c07.gif)
  
  3. Edit Product Details:
  
  ![itemsedit1gif](https://user-images.githubusercontent.com/29640816/43661854-f6c6b3c4-9720-11e8-98aa-9c047187dbd7.gif)
  ![itemedit2gif](https://user-images.githubusercontent.com/29640816/43662753-28573352-9724-11e8-9b6f-942e6ea657f7.gif)
  
  
  4. See a list of all inventory from a Main Activity:
  
  ![listofitemsgif](https://user-images.githubusercontent.com/29640816/43664217-639b912e-9729-11e8-817f-72a13554844f.gif)
  
  In the Main Activity, each list item displays the Product Name, Price, and Quantity.
  Each list item contains a SaleButton that reduces the total quantity of that particular product by one
  (includes logic so that no negative quantities are displayed).
  
  ![salegif](https://user-images.githubusercontent.com/29640816/43665948-28525070-972f-11e8-9ad8-422a96546ac6.gif)
  
  The Product Detail Layout displays the Product Name, Price, Quantity, Supplier Name, and Supplier Phone Number 
  that's stored in the database.
  The Product Detail Layout contains buttons that increase and decrease the available quantity displayed.
  There is a check in the code to ensure that no negative quantities display (zero is the lowest amount).
  The Product Detail Layout contains a button to delete the product record entirely.
  
  ![deletegif](https://user-images.githubusercontent.com/29640816/43666274-65c5812e-9730-11e8-86f8-e4b46e3ec9cb.gif)
  
  There is a a button for the user to contact the supplier via an intent to a phone app using the Supplier Phone Number stored
  in the database.
  
  ![phonegif](https://user-images.githubusercontent.com/29640816/43666578-a9e1379e-9731-11e8-833d-8ce493604499.gif)
