class Magazine extends LibraryItem{
    private String issueDate;
    private String publisher;

    Magazine(String title,String itemID,String issueDate,String publisher){
        super(title,itemID);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }
}
