
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;  

public class Mensagem {
    //Atributos
    private String autor;
    private Calendar data;
    private String texto;
    private int numero;
    
    //Arrays para menssagens
    ArrayList <Comentario> coment = new ArrayList<>();
    
  
    //Getters e Setters
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int a){
        this.numero = a;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String at) {
        this.autor = at;
    }

    public Calendar getData() {
        return this.data;
    }
    public void setData(Calendar d) {
        this.data = d;
    }

    public String getTexto() {
        return this.texto;
    }
    public void setTexto(String t) {
        this.texto = t;
    }

    public ArrayList<Comentario> getComent() {
        return coment;
    }
    public void setComent(ArrayList<Comentario> coment) {
        this.coment = coment;
    }
    
    
    
     //Inicializando o Scanner
    Scanner on = new Scanner(System.in);
    Scanner at = new Scanner(System.in);
    
    //Métodos Adicionais
     public Usuario buscar(ArrayList <Usuario> usuarios, String login){
        for(int i=0; i < usuarios.size(); i++){
            if(usuarios.get(i).getLogin().equals(login)){
                return usuarios.get(i); //retorna o objeto todo
            }
        } 
        return null;
     }}
   