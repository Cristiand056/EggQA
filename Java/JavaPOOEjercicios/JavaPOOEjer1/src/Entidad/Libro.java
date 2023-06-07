package Entidad;

public class Libro {
    String ISBN;
    String Titulo;
    String Autor;
    String NPaginas;
    String Usuario;
    
     public Libro() {
    }
     
    public Libro(String ISBN, String Titulo, String Autor, String NPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NPaginas = NPaginas;
    }
    
    public void CargarLibro(String Usuario){
        this.Usuario = Usuario;    
        MostrarLibro();
    }
    
    public void MostrarLibro(){
        System.out.println(ISBN+" "+Titulo+" "+Autor+" "+NPaginas);
    }
    
}
