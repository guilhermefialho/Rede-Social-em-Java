
import java.util.Calendar;
import java.util.Scanner;
import java.util.ArrayList;

public class Usuario {
    //VariÃ¡veis globais
    int r = 0;
    
    //Atributos
    private String nome;
    private String email;
    private Calendar dataNasc;
    private String login;
    
    //Arrays para o usuÃ¡rio
    private ArrayList<Usuario> seguidores = new ArrayList<>();
    private ArrayList<Usuario> seguindo = new ArrayList<>();
    private ArrayList<Mensagem> messange = new ArrayList<>();
    
    //Construtor padrÃ£o
    public Usuario(){}
    
    //Getters e Setters
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nm) {
        this.nome = nm;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String em) {
        this.email = em;
    }

    public Calendar getDataNasc() {
        return this.dataNasc;
    }
    public void setDataNasc(Calendar dn) {
        this.dataNasc = dn;
    }

    public String getLogin() {
        return this.login;
    }
    public void setLogin(String lg) {
        this.login = lg;
    }

    public ArrayList<Usuario> getSeguidores() {
        return this.seguidores;
    }
    public void setSeguidores(ArrayList<Usuario> seguidores) {
        this.seguidores = seguidores;
    }

    public ArrayList<Usuario> getSeguindo() {
        return this.seguindo;
    }
    public void setSeguindo(ArrayList<Usuario> seguindo) {
        this.seguindo = seguindo;
    }

    public ArrayList<Mensagem> getMessange() {
        return messange;
    }
    public void setMessange(ArrayList<Mensagem> messange) {
        this.messange = messange;
    }
    
    
    
    //Inicializando o Scanner
    Scanner on = new Scanner(System.in);
    Scanner at = new Scanner(System.in);
    
    //Metodos adicionais
    public void cadastrar(){
        System.out.println("     CADASTRAMENTO DO USUARIO    ");
        System.out.print("Nome: ");
        this.nome = at.nextLine();
        System.out.print("Email (sem espaco): ");
        this.email = on.next();
        System.out.println("Data de nascimento ");
        System.out.print("Dia: ");
        int d = on.nextInt();
        System.out.print("Mes: ");
        int m = on.nextInt();
        System.out.print("Ano (completo): ");
        int a = on.nextInt();
        
        /*iniciando o Calendar e colocando os dados da data de nascimento 
          do usuÃ¡rio no atributo dataNasc*/
        dataNasc = Calendar.getInstance();
        this.dataNasc.set(Calendar.DAY_OF_MONTH, d);
        this.dataNasc.set(Calendar.MONTH, (m-1));
        this.dataNasc.set(Calendar.YEAR, a);
        
     ;  
    }
    
    public void listar(){
        System.out.println("Nome:  "+this.getNome()+"   |   Login: "+this.getLogin());
        System.out.println("------------------------------------------");
    }
    
    public void pesquisarDados(){
        System.out.println("     DADOS DO USUÃ�RIO(A)   ");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Email: "+this.getEmail());
        System.out.printf("Data de nascimento: %.2d/%.2d/%.4d", this.dataNasc.get(Calendar.DAY_OF_MONTH),
                            (this.dataNasc.get(Calendar.MONTH) + 1), this.dataNasc.get(Calendar.YEAR));
         System.out.println("Login: "+this.getLogin());
    }
     
    public void alterar(){
        System.out.println("   ABA DE ALTERACOES DO USUARIO(A)   ");
        System.out.println("1 - Nome. ");
        System.out.println("2 - Email. ");
        System.out.println("3 - Data de Nascimento. ");
        System.out.print("Opcao: ");
        int op = on.nextInt();
        
        switch(op){
            case 1:
                do{
                    System.out.print("Digite o novo nome: ");
                    String nn = at.nextLine();
                    if(nn.equalsIgnoreCase(this.getNome())){
                        System.out.println("Alteracao nao realizada! O novo nome e igual ao antigo, tente novamente.");
                        r = 1;
                    } else{
                        this.setNome(nn);
                        System.out.println("Nome alterado com sucesso!!");
                        r = 0;
                    }
                }while(r == 1);
                System.out.println("");
                break;
            case 2:
                do{
                    System.out.print("Digite o novo email: ");
                    String ne = on.next();
                    if(ne.equalsIgnoreCase(this.getEmail())){
                        System.out.println("Alteracao nao realizada! O novo email e igual ao antigo, tente novamente.");
                        r = 1;
                    } else{
                        this.setEmail(ne);
                        System.out.println("Email alterado com sucesso!!");
                        r = 0;
                    }
                }while(r == 1);
                System.out.println("");
                break;
            case 3: 
                System.out.println("Digite a nova data de nascimento ");
                System.out.print("Dia: ");
                int dia = on.nextInt();
                System.out.print("Mes: ");
                int mes = on.nextInt();
                System.out.print("Ano: ");
                int ano = on.nextInt();
                
                this.dataNasc.set(Calendar.DAY_OF_MONTH, dia);
                this.dataNasc.set(Calendar.MONTH, (mes-1));
                this.dataNasc.set(Calendar.YEAR, ano);

                System.out.println("Data de nascimento alterada com sucesso!!");
                System.out.println("");
                break;
        }
    }
    
    public Usuario buscar(ArrayList <Usuario> usuarios, String login){
        for(int i=0; i < usuarios.size(); i++){
            if(usuarios.get(i).getLogin().equals(login)){
                return usuarios.get(i); //retorna o objeto todo
            }
        } 
        return null;
    }
    
    public void seguir(ArrayList <Usuario> usuarios, String login){
        Usuario use = buscar(usuarios,login);
        if(use != null){
          use.getSeguidores().add(this);
          this.getSeguindo().add(use);
        }else{
            System.out.println("Usuario nao encontrado.");
        }
    }
    
    public void cancelarSeguir(ArrayList <Usuario> usuarios, String login){
        Usuario use = buscar(usuarios,login);
        //um usuÃ¡rio nÃ£o pode seguir ele mesmo
        if(use != null && use != this){ 
          use.getSeguidores().remove(this);
          this.getSeguindo().remove(use);
        }else{
            System.out.println("Usuario nao encontrado."); 
        }
        System.out.println("");
    }
    
    public void exibirSeguidores(){
        System.out.println("Lista de seguidores de "+this.getNome());
        for(int i=0; i < this.getSeguidores().size(); i++){
            System.out.println("Nome: "+this.getSeguidores().get(i).getNome()+
                               "  |  Login: "+this.getSeguidores().get(i).getLogin());
        }
    }
    
    public void exibirSeguidos(){
       System.out.println("Lista de seguidos por "+this.getNome());
        for(int i=0; i < this.getSeguindo().size(); i++){
            System.out.println("Nome: "+this.getSeguindo().get(i).getNome()+
                               "  |  Login: "+this.getSeguindo().get(i).getLogin());
        } 
    }
    
    public void excluir(){
        this.setNome(null);
        this.setEmail(null);
        this.setLogin(null);
    }
}