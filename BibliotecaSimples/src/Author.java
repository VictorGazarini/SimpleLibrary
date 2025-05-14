import javax.xml.namespace.QName;

public class Author extends Person{

    private String biography;

    // Construtor
    public Author(String name, String email, String biography) {
        super(name, email);
        this.biography = biography;
    }

    public void showInformations(){
        System.out.println("Name:" + getName());
        System.out.println("E-mail:" + getEmail());
        System.out.println("Byography:" + biography);
    }


}
