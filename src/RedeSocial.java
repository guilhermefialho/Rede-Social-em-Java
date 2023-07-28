import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
public class RedeSocial {
    public static void main(String[] args) {
     ArrayList<Usuario>U = new ArrayList<>();
     ArrayList<Seguidores>S = new ArrayList<>();
     Scanner at = new Scanner(System.in);
     Scanner in = new Scanner(System.in);
  
      int x;
      String resp1;
      do{
    	  System.out.println("***********************************");
			System.out.println("	        FEED INICIAL	       ");
			System.out.println("***********************************");
			System.out.println("	            MENU	           ");
			System.out.println("***********************************");
			System.out.println(" Enter:");
			System.out.println(" 1 - USUARIO");
			System.out.println(" 2 - SEGUIDOR");
			System.out.println(" 3 - MENSAGENS");
			System.out.println(" 4 - REDE");
			System.out.println(" 0 - SAIR");
			System.out.println("***********************************");
			System.out.print(" Eu escolhi: ");
          x = at.nextInt();
          switch(x){
              case 1:
                  String resp2;
                  do{
                	  System.out.println("***********************************");
      				System.out.println(" 1 - Cadastrar Usuario");
      				System.out.println(" 2 - Excluir Usuario");
      				System.out.println(" 3 - Listar Usu�rios");
      				System.out.println(" 4 - Pesquisar Usuario");
      				System.out.println(" 5 - Alterar Usuario");
      				
      				System.out.println("***********************************");
      				System.out.print(" Eu escolhi: ");
      				
                  int op;
                  op = at.nextInt();   
                  switch(op){
                      case 1:
                          int t1=0;
                          Usuario u1 = new Usuario();
                          Usuario u2 = new Usuario();
                          String b1;
                          String b2;
                          String l;
                          if(U.isEmpty()){
                          u1.cadastrar();
                          System.out.printf("Login (senha): ");
                          l=at.next();
                          u1.setLogin(l);
                          System.out.println("");
                          System.out.println("Usuarico cadatrado com sucesso!!");
                          System.out.println("");
                          U.add(u1);
                          }else{
                              System.out.printf("Para conferir se o usuário já existe, digite o Login (senha): ");
                              b1=at.next();
                              System.out.println(" ");
                              u1.setLogin(b1);
                              for(int a=0;a<U.size();a++){
                               u2=U.get(a);
                               b2=u2.getLogin();
                               if(b1.equalsIgnoreCase(b2)){
                                   System.out.println("Esse usuário já existe.");
                                   t1++;
                               }
                             }if(t1==0){
                                 u1.cadastrar();
                                 System.out.println("");
                                 System.out.println("Usu�rio cadastrado com sucesso!!");
                                 System.out.println("");
                                 U.add(u1);
                             }      
                          }
                          break;
                      case 2:
                          if(U.isEmpty()){
                              System.out.println("Nenhum usuario foi cadastrado.");
                          }else{
                              int t2=0;
                              Usuario u3 = new Usuario();
                              String b3;
                              String b4;
                              System.out.printf("Digite o Login (senha) do usuario a ser excluido: ");
                              b3=at.next();
                              for(int a=0;a<U.size();a++){
                                  u3=U.get(a);
                                  b4=u3.getLogin();
                                  if(b3.equalsIgnoreCase(b4)){
                                   u3.excluir();
                                   U.set(a, u3);
                                   U.remove(u3);
                                      System.out.printf("\nUsuario excluido com sucesso.");
                                   t2++;
                                  }
                              }if(t2==0){
                                  System.out.println("Este usuario nao existe.");
                              }
                          }
                          break;
                      case 3:
                          if(U.isEmpty()){
                              System.out.println("Nenhum usuario foi cadastrado.");
                          }else{
                              Usuario u3 = new Usuario();
                              System.out.printf("                 LISTA COM TODOS OS USUARIOS");
                              System.out.println(" ");
                              System.out.println(" ");
                              for(int a=0;a<U.size();a++){
                                  u3=U.get(a);  
                                  u3.listar();
                              }
                          }
                          break;
                      case 4:
                          if(U.isEmpty()){
                              System.out.println("Nenhum usuario foi cadastrado.");
                          }else{
                              int t2=0;
                              Usuario u3 = new Usuario();
                              String b3;
                              String b4;
                              System.out.printf("Digite o Login (senha) do usuario a ser mostrado: ");
                              b3=at.next();
                              for(int a=0;a<U.size();a++){
                                  u3=U.get(a);
                                  b4=u3.getLogin();
                                  if(b3.equalsIgnoreCase(b4)){
                                   u3.listar();
                                   t2++;
                                  }
                              }if(t2==0){
                                  System.out.println("Este usuario não existe.");
                              }
                          }
                          break;
                      case 5:
                          if(U.isEmpty()){
                              System.out.println("Nenhum usuario foi cadastrado.");
                          }else{
                              int t2=0;
                              Usuario u3 = new Usuario();
                              String b3;
                              String b4;
                              System.out.printf("Digite o Login (senha) do usuario a ser alterado: ");
                              b3=at.next();
                              for(int a=0;a<U.size();a++){
                                  u3=U.get(a);
                                  b4=u3.getLogin();
                                  if(b3.equalsIgnoreCase(b4)){
                                   u3.alterar();
                                   t2++;
                                  }
                              }if(t2==0){
                                  System.out.println("Este usuario não existe.");
                              }
                          }
                          break;
                      default:
                          System.out.println("Opcao Invalida. Tente Novamente.");
                        break;
                  }
                  System.out.println(" ");
                  System.out.print("Deseja sair da pagina? [S]/[N]: ");
                  resp2 = at.next();        
                  }while("N".equalsIgnoreCase(resp2));
                  break;
              case 2:
                  String resp3;
                  do{
                	  System.out.println("***********************************");
      				System.out.println(" 1 - Seguir");
      				System.out.println(" 2 - Cancelar seguir");
      				
      				System.out.println("***********************************");
      				System.out.print(" Eu escolhi: ");
                  int op;
                  op = at.nextInt();   
                  switch(op){
                      case 1:
                          if(U.isEmpty()){
                              System.out.println("Nenhum usuario foi cadastrado.");
                          }else{
                          System.out.printf("\nDigite o Login do usuario a ser seguido: ");
                          String s1;
                          s1=at.next();
                          Usuario u = new Usuario();
                          Usuario u1 = new Usuario();
                          String s3;
                          String s4;
                          String j;
                          for(int a=0;a<U.size();a++){
                              u=U.get(a);
                              s3=u.getLogin();
                              if(s3.equalsIgnoreCase(s1)){
                                  s4=u.getNome();
                                  System.out.printf("\nNome: %s",s4);
                                  System.out.printf("\nLogin: %s",s3);
                              }
                          }
                          System.out.printf("\nDigite o Login do novo seguidor: ");
                          String s2;
                          s2=at.next();
                          Seguidores S1 = new Seguidores();
                          S1.setSeguido(s1);
                          S1.setSeguidor(s2);
                          ArrayList<Usuario>U1 = new ArrayList<>();
                          ArrayList<Usuario>U2 = new ArrayList<>();
                          for(int a=0;a<U.size();a++){
                              u1=U.get(a);
                              j=u1.getLogin();
                              if(j.equalsIgnoreCase(s2)){
                                  U1=u.getSeguidores();
                                  U1.add(u1);
                                  u.setSeguidores(U1);
                                  U2=u1.getSeguindo();
                                  U2.add(u);
                                  u1.setSeguindo(U2);
                              }
                          }
                          S.add(S1);
                          }
                          break;
                      case 2:
                          if(S.isEmpty()){
                              System.out.println("Nenhum usuario possui seguidor no momento.");
                          }else{
                              Seguidores S2 = new Seguidores();
                              int t3=0;
                          System.out.printf("\nDigite o Login do primeiro usuario: ");
                          String s5;
                          s5=at.next();
                              System.out.printf("\nDigite o Login do usuario para deseguir: ");
                              String s6;
                              s6=at.next();
                              String s7;
                              String s8;
                              for(int a=0;a<S.size();a++){
                                  S2=S.get(a);
                                  s7=S2.getSeguidor();
                                  s8=S2.getSeguido();
                                  if(s5.equalsIgnoreCase(s8)){
                                      if(s6.equalsIgnoreCase(s7)){
                                          S.add(a, S2);
                                          S.remove(S2);
                                          System.out.printf("\nUsuario deseguido com sucesso.");
                                          t3++;
                                  }
                              }
                          }if(t3==0){
                              System.out.printf("\nO usuario %s já não segue o usuario #s.",s5,s6);
                          }
                  }
                          break;
                      default:
                          System.out.println("Opçao invalida.");
                          break;
                  }
                  System.out.println(" ");
                  System.out.print("Deseja sair da pagina? [S]/[N]: ");
                  resp3 = at.next();        
                  }while("N".equalsIgnoreCase(resp3));
                  break;
              case 3:
                  String resp4;
                  do{
                	  System.out.println("***********************************");
      				System.out.println(" 1 - Registrar Mensagem");
      				System.out.println(" 2 - Comentar Mensagem");
      				System.out.println(" 3 - Ver Mensagem");

      				System.out.println("***********************************");
      				System.out.print(" Eu escolhi: ");
                  int op;
                  op = at.nextInt();   
                  switch(op){
                      case 1:
                          System.out.printf("\nDigite o Login para registrar uma mensagem: ");
                          String c,c1;
                          Usuario uu = new Usuario();
                          Usuario u1 = new Usuario();
                          c=at.next();
                          for(int a=0;a<U.size();a++){
                              uu = U.get(a);
                              c1=uu.getLogin();
                              if(c.equalsIgnoreCase(c1)){
                                  u1=uu;
                              }
                          }
                          String m;
                          Mensagem M = new Mensagem();
                          M.setAutor(c);
                          do{
                              System.out.printf("\nDigite a mensagem: ");
                           
							m=in.nextLine();
                          }while(m.length()>140);
                          M.setTexto(m);
                          ArrayList<Mensagem>Ms = new ArrayList<>();
                          Ms=u1.getMessange();
                          Ms.add(M);
                          u1.setMessange(Ms);
                          break;
                      case 2:
                          
                          Usuario uw1 = new Usuario();
                          Usuario uw2 = new Usuario();
                          Usuario uw3 = new Usuario();
                          Mensagem mw1 = new Mensagem();
                          ArrayList<Mensagem>Mw1 = new ArrayList<>();
                          ArrayList<Usuario>U1 = new ArrayList<>();
                          System.out.printf("\nDigite o Login do usuario para exibir suas mensagens: ");
                          String lg0,lg1;
                          lg0=in.next();
                          int t=1;
                          String au,men;
                          for(int a=0;a<U.size();a++){
                              uw1=U.get(a);
                              lg1=uw1.getLogin();
                              if(lg0.equalsIgnoreCase(lg1)){  
                                  U1=uw1.getSeguidores();
                                  Mw1=uw1.getMessange();
                                  for(int b=0;b<Mw1.size();b++){
                                      mw1=Mw1.get(b);
                                      mw1.setNumero(t);
                                      Mw1.set(b, mw1);
                                      au=mw1.getAutor();
                                      men=mw1.getTexto();
                                      System.out.println(" ");
                                      System.out.printf("\nMensagem: %s",men);
                                      System.out.printf("\nAutor: %s",au);
                                      t++;
                                  }
                              }
                          }
                          System.out.printf("\nDigite o Login do usuario para inserir um comentario: ");
                          String lg2,lg3;
                          lg2=in.next();
                          for(int a=0;a<U.size();a++){
                              uw2=U.get(a);
                              lg3=uw2.getLogin();
                              if(lg2.equalsIgnoreCase(lg3)){
                                  uw3=uw2;
                              }
                          }
                          
                          System.out.printf("\nDigite o numero da mensagem para comentar: ");
                          int nm,nm1;
                          nm=in.nextInt();
                          Mensagem me = new Mensagem();
                          for(int d=0;d<Mw1.size();d++){
                              mw1=Mw1.get(d);
                              nm1=mw1.getNumero();
                              if(nm==nm1){
                                  me=mw1;
                              }
                          }
                              System.out.printf("\nDigite o comentario: ");
                              String cm;
                              cm=in.nextLine();
                              Comentario C = new Comentario();
                              C.setComent(cm);
                              C.setAutor(lg2);
                              ArrayList<Comentario>Cm = new ArrayList<>();
                              Cm=me.getComent();
                              Cm.add(C);
                              me.setComent(Cm);
                          
                          
                          
                          
                          
                          break;
                      case 3:
                          Usuario uw = new Usuario();
                          Usuario sg = new Usuario();
                          Mensagem mw = new Mensagem();
                          ArrayList<Mensagem>Mw = new ArrayList<>();
                          System.out.printf("\nDigite o Login do usuario para exibir suas mensagens: ");
                          String lg11,lg12;
                          lg11=at.next();
                          int t1=1;
                          String au1,men1;
                          for(int a=0;a<U.size();a++){
                              uw=U.get(a);
                              lg12=uw.getLogin();
                              if(lg11.equalsIgnoreCase(lg12)){                                  
                                  Mw=uw.getMessange();
                                  for(int b=0;b<Mw.size();b++){
                                      mw=Mw.get(b);
                                      au1=mw.getAutor();
                                      men1=mw.getTexto();
                                      System.out.printf("\nPostagem %d:",t1);
                                      System.out.println(" ");
                                      System.out.printf("\nMensagem: %s",men1);
                                      System.out.printf("\nAutor: %s",au1);
                                      t1++;
                                      sg=uw;
                                  }
                              }
                          }
                          
                          ArrayList<Usuario>Sg = new ArrayList<>();
                          Sg=sg.getSeguindo();
                          if(Sg.isEmpty()){
                              System.out.println("\nEste usuario nao segue nenhum perfil.");
                          }else{
                              System.out.printf("\n\nMensagens postadas pelos perfis que %s segue: ",lg11);
                          Usuario wz = new Usuario();
                          Mensagem ww = new Mensagem();
                          for(int a1=0;a1<Sg.size();a1++){
                              wz=Sg.get(a1);
                              ArrayList<Mensagem>Mi = new ArrayList<>();
                              Mi=wz.getMessange();
                              if(Mi.isEmpty()){
                              }else{  
                                  for(int b=0;b<Mi.size();b++){
                                      ww=Mi.get(b);
                                      au=ww.getAutor();
                                      men=ww.getTexto();
                                      System.out.println(" ");
                                      System.out.printf("\nMensagem: %s",men);
                                      System.out.printf("\nAutor: %s",au);
                                  }
                              }
                          }
                          }
                          break;
                      default:
                          System.out.println("Opçao invalida.");
                          break;

                  }
                  System.out.println(" ");
                  System.out.print("Deseja sair da pagina? [S]/[N]: ");
                  resp4 = at.next();        
                  }
                  
                  
                  while("N".equalsIgnoreCase(resp4));
                  break;
              case 4:
                  String resp5;
                  do{
                	  System.out.println("***********************************");
      				System.out.println(" 1 - Seguidores");
      				System.out.println(" 2 - Seguidos");
      				System.out.println(" 3 - Mais Influente");
      				System.out.println(" 4 - Ocorrencia de assunto");

      				System.out.println("***********************************");
      				System.out.print(" Eu escolhi ");
                  int op;
                  op = at.nextInt();   
                  switch(op){
                      case 1:
                          System.out.printf("\nDigite o Login do usuario para listar seus seguidores: ");
                          String s,s1,s2,s3,s4;
                          s=at.next();
                          int total=0;
                          Seguidores S3 = new Seguidores();
                          Usuario u = new Usuario();
                          for(int a=0;a<S.size();a++){
                              S3=S.get(a);
                              s1=S3.getSeguido();
                              if(s.equalsIgnoreCase(s1)){
                                  s2=S3.getSeguidor();
                                  for(int b=0;b<U.size();b++){
                                      u=U.get(b);
                                      s3=u.getLogin();
                                      if(s2.equalsIgnoreCase(s3)){
                                          s4=u.getNome();
                                          System.out.println(" ");
                                          System.out.printf("\nNome: %s",s4);
                                          System.out.printf("\nLogin: %s",s3);
                                          total++;
                                      }
                                  }
                              }
                          }System.out.printf("\nTotal de %d seguidores.",total);
                          break;
                      case 2:
                          System.out.printf("\nDigite o Login do usuario para listar os seguidos: ");
                          String z,z1,z2,z3,z4;
                          z=at.next();
                          int total1=0;
                          Seguidores S4 = new Seguidores();
                          Usuario u1 = new Usuario();
                          for(int a=0;a<S.size();a++){
                              S4=S.get(a);
                              z1=S4.getSeguidor();
                              if(z.equalsIgnoreCase(z1)){
                                  z2=S4.getSeguido();
                                  for(int b=0;b<U.size();b++){
                                      u1=U.get(b);
                                      z3=u1.getLogin();
                                      if(z2.equalsIgnoreCase(z3)){
                                          z4=u1.getNome();
                                          System.out.println(" ");
                                          System.out.printf("\nNome: %s",z4);
                                          System.out.printf("\nLogin: %s",z3);
                                          total1++;
                                      }
                                  }
                              }
                          }System.out.printf("\nTotal de %d seguidos.",total1);
                          break;
                      case 3:
                          Seguidores Z = new Seguidores();
                          Seguidores Z1 = new Seguidores();
                          Usuario v = new Usuario();
                          int total3 = 0;
                          int total2 = 0;
                          String o,o1,o2,o3;
                          for(int a=0;a<S.size();a++){
                              Z=S.get(a);
                              o=Z.getSeguido();  
                              for(int a1=0;a1<S.size();a1++){
                                  Z1=S.get(a1);
                                  o1=Z1.getSeguido();
                                  if(o.equalsIgnoreCase(o1)){
                                      total2++;
                                  }
                              }
                              if(total2>total3){
                                  total3=total2;
                              }
                              total2=0;
                           }
                          for(int a=0;a<S.size();a++){
                              Z=S.get(a);
                              o=Z.getSeguido();  
                              for(int a1=0;a1<S.size();a1++){
                                  Z1=S.get(a1);
                                  o1=Z1.getSeguido();
                                  if(o.equalsIgnoreCase(o1)){
                                      total2++;
                                  }
                              }
                              if(total2==total3){
                                  for(int a2=0;a2<U.size();a2++){
                                      v=U.get(a2);
                                      o2=v.getLogin();
                                      if(o.equalsIgnoreCase(o2)){
                                          o3=v.getNome();
                                  System.out.printf("\nPerfil mais influente: ");
                                  System.out.printf("\nNome: %s",o3);
                                  System.out.printf("\nLogin: %s",o);
                                          System.out.printf("\n\nTotal de seguidores: %d",total3);
                                  a=U.size();
                                  total2=0;
                                      }
                                  }
                              }
                           }
                           
                         
                          break;
                      case 4:
                          System.out.printf("\nDigite a expressão desejada: ");
                          String exp;
                          exp=at.next();
                          int tex=0;
                          String expce,expmex;
                          Usuario ue = new Usuario();
                          Mensagem mex = new Mensagem();
                          Comentario ce = new Comentario();
                          ArrayList<Mensagem>Mex = new ArrayList<>();
                          ArrayList<Comentario>Ce = new ArrayList<>();
                          for(int a=0;a<U.size();a++){
                              ue=U.get(a);
                              Mex=ue.getMessange();
                              for(int b=0;b<Mex.size();b++){
                                  mex=Mex.get(b);
                                  expmex=mex.getTexto();
                                  Ce=mex.getComent();
                                  for(int d=0;d<Ce.size();d++){
                                      ce=Ce.get(d);
                                      expce=ce.getComent();
                                      if(expce.contains(exp)){
                                          tex++;
                                      }
                              }        
                                  if(expmex.contains(exp)){
                                      tex++;
                                  }
                          }
                          }
                          if(tex==0){
                              System.out.printf("\nEssa expressão não aparece nenhuma vez.");
                          }else{
                              System.out.printf("\nEssa expressao apareceu %d vezes",tex);
                          }
                          
                          break;
                      default:
                          System.out.println("Opçao invalida.");
                          break;
                  } 
                  System.out.println(" ");
                  System.out.print("Deseja sair da pagina? [S]/[N]: ");
                  resp5 = at.next();        
                  }while("N".equalsIgnoreCase(resp5));
                  break;
              default:                 
                  System.out.println("Opcao Invalida. Tente Novamente.");
                        break;
                  }
          System.out.println(" ");
          System.out.print("Deseja sair do programa? [S]/[N]: ");
          resp1 = at.next();        
      }while("N".equalsIgnoreCase(resp1));
    }
}
