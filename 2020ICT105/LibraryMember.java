class LibraryMember{
    private String memberID;
    private String name;

    LibraryMember(String memberID,String name){
        this.memberID = memberID;
        this.name = name;
    }

    public void displayMemberDetails(){
        System.out.print("Member ID: " + memberID + "  ");
        System.out.println("Name: " + name);
    }
}
