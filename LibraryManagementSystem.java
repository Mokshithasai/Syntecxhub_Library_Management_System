import java.util.ArrayList;
import java.util.Scanner;
public class LibraryManagementSystem{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Book>books=new ArrayList<>();
        String username = "admin";
        String password = "12345";
        System.out.println("==========Library Login==========");
        System.out.println("Enter Username:");
        String user = sc.nextLine();
        System.out.println("Enter Password:");
        String pass = sc.nextLine();
        if(user.equals(username)&&pass.equals(password)){
            System.out.println("Login successfully!");
        }else{
            System.out.println("Invalid username or password");
            sc.close();
            return;
        }
        while(true){
        System.out.println("Welcome to Library Management System");
        System.out.println("1.Add a book");
        System.out.println("2.View book");
        System.out.println("3.Search book");
        System.out.println("4.Remove book");
        System.out.println("5.Logout&Exit");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        if(choice==1){
            sc.nextLine();
            System.out.println("Enter Book title:");
            String title = sc.nextLine();
            System.out.println("Enter Author Name:");
            String author = sc.nextLine();
            System.out.println("Enter Book ID:");
            int bookId = sc.nextInt();
            Book book = new Book(bookId,title,author);
            books.add(book);
            System.out.println("Book added successfully!");
        }else if(choice==2){
            if(books.isEmpty()){
                System.out.println("No books available");
            }else{
            for(Book b:books){
                System.out.println("----------------");
                System.out.println("Book ID:"+b.bookId);
                System.out.println("Title:"+b.title);
                System.out.println("Author:"+b.author);
            }
        }
            }else if(choice==3){
                sc.nextLine();
                System.out.println("Enter Book Title to search:");
                String searchTitle = sc.nextLine();
                boolean found = false;
                for(Book b:books){
                    if(b.title.equalsIgnoreCase(searchTitle)){
                        System.out.println("Book Found");
                        System.out.println("Book ID:"+b.bookId);
                        System.out.println("Title:"+b.title);
                        System.out.println("Author:"+b.author);
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Book Not Found!");
                }
            }else if(choice==4){
                        System.out.println("Enter Book ID to Remove:");
                        int removeId = sc.nextInt();
                        boolean removed=false;
                        for(int i=0; i<books.size(); i++){
                            if(books.get(i).bookId==removeId){
                                books.remove(i);
                                System.out.println("Book removed successfully!");
                                removed = true;
                                break;
                            }
                        }
                        if(!removed){
                            System.out.println("Book ID not found.");
                        }
                    }
                            else if(choice==5){
                                System.out.println("Logging out...");
                                System.out.println("Logout successfully!");
                                System.out.println("Thank you for using the Library Management System.");
                                sc.close();
                                break;
                            }else{
                                System.out.println("Invalid Choice!");
                            }
                        }
                    }
                }
            
        
