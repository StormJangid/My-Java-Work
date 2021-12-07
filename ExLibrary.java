

class Library{
    int a, num_of_books=0;
    String books[] = new String[50];
    public void AvailableBooks() {
        for(int i = 0;i<books.length;i++){
            if(books[i]==null){
                continue;
            }
            else{
                System.out.println("* "+books[i]);
            }
        }
    }
    public void AddBook(String n) {
                books[num_of_books] = n;
                num_of_books++;
                System.out.println(n+" Book is Added");
    }
    public void returnbook(String b) {
                books[num_of_books] = b;
                num_of_books++;
                System.out.println(b+" Book is Returned");
    }
    public void IssueBook(String c){
        for(int i = 0;i<books.length;i++){
            if(books[i]==c){
                books[i]=null;
                System.out.println(c+" Book has been Issued");
                return;
            }
        }
        System.out.println(c+" Book is not Available");
    }
}

public class ExLibrary {
    public static void main(String[] args) {
        Library obj = new Library();
        obj.AddBook("java");
        obj.AddBook("c++");
        obj.AddBook("python");
        obj.AddBook("go");
        obj.AddBook("swift");
        obj.AvailableBooks();
        obj.IssueBook("c++");
        obj.AvailableBooks();
    }
}
