abstract class LibraryItem{
    private String title;
    private String itemID;
    private boolean checkedOut;


    LibraryItem(String title,String itemID){
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }

    public void checkOut(){
        checkedOut = true;
    }

    public void checkIn(){
        checkedOut = false;
    }

    public void displayItemDetails(){
        System.out.print("Title: " + title + "  ");
        System.out.print("Item ID: " + itemID + "  ");
        System.out.println("Checked Out: " + checkedOut);
    }
}
