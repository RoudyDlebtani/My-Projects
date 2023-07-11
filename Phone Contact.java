


package project.pkgfinal.java.pkg3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;







public class ProjectFinalJava3 {
    DefaultListModel model = new DefaultListModel();

   JList list1;
   JFrame project,project1,project2,project3,project4,project5,project6,project7;     
   String data2[][],columnName3[],data3[][],columnName4[],data4[][],columnName5[],data5[][];
   JTable tabel1,tabel2,tabel3,tabel4,tabel5,tabel6,tabel7,tabel8;
   JPanel panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8,panel11,panel12,panel13,panel14,panel15,panel16,panel17,panel18,panel19;
   String []firstRow3;
   JButton message8,contacts,groupsButton,sortByFirstName,sortByLastName,sortByCity,addNewContact,view,update,delete1,save1,save2,cancel1,cancel2,cancel3,cancel4,addNewgroups,delete3,upddateGroup,saveGroup1,saveGroup2, call,close8;            
   JLabel contact,midle,newContact,firstName1,lastName1,city1,firstName2,lastName2,city2,addTheContact,phoneNumber1,phoneNumber2,search,groupLabel,listOfGroups,UpdateContact,groupName1,groupName2,description1,description2,k,updateNewGroup,addTheContactToGroup,modifyContactGroups;
   JLabel gestionContacts,gestionContacts2,gestionContacts3,gestionContacts4,gestionContacts5,gestionContacts6,gestionContacts7,gestionContacts8,firstName8,lastName8,city8,phoneNumber8,regionCode8,firstName81,lastName81,city81,phoneNumber81,regionCode81;
   JCheckBox coWorkers2,noGroups1,famillies1,freinds1,coWorkers1,threePoints1,noGroups2,famillies2,freinds2,University,threePoints2,contactBox;
   JTextField cityIn8,searchIn,firstNameIN1,lastNameIn1,cityIn1,firstNameIN2,lastNameIn2,cityIn2,groupName1IN,groupName2IN,description1IN,description2IN,firstNameIN8,lastNameIn8;
   int count,countGroup,listIndex,RowIndex3,ColumnIndex3,countBox=0;
   String s;
   int checkBoxWidth=0;
        int checkBoxheight=0;
           
       ArrayList<JCheckBox> CheckBoxArray1=new  ArrayList<JCheckBox>();
       ArrayList<JCheckBox> CheckBoxArray2=new  ArrayList<JCheckBox>();
       ArrayList<JCheckBox> CheckBoxArray3=new  ArrayList<JCheckBox>();
    
    
    
    
    
    
    
      
 ArrayList<String> JListArray= new ArrayList<String>();    
  ArrayList<contact> ContactArray= new ArrayList<contact>();
 
  ArrayList<group> GroupArray= new ArrayList<group>();
  
  
      

  
        
        //cette class contient un nom,une descrition et une list de contact 
       //dans le constructeur j'ais mis tout les contact dans la list
      
   class group {
      String Gname,Gdescription;
      
      ArrayList<contact> contactIn= new ArrayList<contact>();
      
       group(String Gname, String Gdescription,ArrayList<contact> contactIn){
          
         
           this.Gname=Gname;
           this.Gdescription=Gdescription;
           
           for(int i=0;i<contactIn.size();i++){
                  this.contactIn.add(contactIn.get(i));
                   
               }
           
           }
       }
  
  
  
  
  
  
  
  
  
  class contact{
      
    

      public  String Fname,Lname,City,phoneNumber[],regionCode[];

  
    
      contact(String Fname,String Lname,String City,JTable phoneNumber,JTable regionCode){

          
           this.Fname=Fname;
           this.Lname=Lname;
           this.City=City;
           this.phoneNumber= new String[phoneNumber.getRowCount()];
           this.regionCode= new String[phoneNumber.getRowCount()];
              
            for(int i=0;i<phoneNumber.getRowCount();i++){
            this.phoneNumber[i]=(String) phoneNumber.getValueAt(i, 1);
        }
             
                              for(int i=0;i<phoneNumber.getRowCount();i++){
            this.regionCode[i]=(String) regionCode.getValueAt(i, 0);
        }


           
         
           
      }
  }
  
  
  

   
   
    ProjectFinalJava3() {

       
        
        //ici j'ai crees une nouvelle fenetre pour acceder tout ,et j'ai mis une JFrame de dans et j'ais cree 2 buton et j'ai les mis dans cette JFrame
            project= new JFrame("project NFA035");
            panel1= new JPanel();
            project.getContentPane().add (panel1);
            project.setBounds(400,200,700,500);project.setVisible(true);
          
          
            panel11= new JPanel();panel11.setBounds(110,50,565,470);panel11.setBackground(Color.CYAN);
            
            panel1.setLayout (null);
            gestionContacts= new JLabel("Gestion des contacts");  gestionContacts.setBounds(180,10,350,20); gestionContacts.setBackground(Color.red);
            gestionContacts.setForeground(Color.blue); gestionContacts.setFont(new Font ("Calabri",Font.BOLD, 20));
            midle= new JLabel();midle.setBounds(100,100,350,350); 
            contacts= new JButton("Contacts");  contacts.setBounds(0,100,103,30);               contacts.addActionListener(new ButtonListener());
            groupsButton= new JButton("Groups");      groupsButton.setBounds(0,170,97,30);     groupsButton.addActionListener(new ButtonListener());
           
            panel1.add(contacts);
            panel1.add (groupsButton);
            panel1.add (gestionContacts);
            panel1.add(panel11);
            
            
         
           
     
         
        
           
//ici j'ai crees une nouvelle fenetre(Contacts) pour acceder des contact et j'ai mis une JFrame de dans 
//et jais cree 7 button et une JList et une search bar et j'ai les mis dans cette JFrame
      
             
           
            project1= new JFrame("project NFA035");
            panel2= new JPanel();
            project1.getContentPane().add (panel2);
            project1.setBounds(400,200,700,500);project1.setVisible(false);
            
            panel12= new JPanel();panel12.setBackground(Color.CYAN);panel12.setBounds(180,30,100,450);
            
            list1= new JList(JListArray.toArray());list1.setVisibleRowCount(9);
            list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            list1.setSize(600,600);
        
            JScrollPane pane1= new JScrollPane(list1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);pane1.setBounds(330,70,300,300);
           
            gestionContacts2= new JLabel("Gestion Des Contacts");  gestionContacts2.setBounds(180,0,250,30); 
            gestionContacts2.setForeground(Color.blue); gestionContacts2.setFont(new Font ("Calabri",Font.BOLD, 20));
            search=new JLabel("Search");search.setBounds(280,30,40,30);
            searchIn=new JTextField();searchIn.setBounds(330,35,350,20);searchIn.addActionListener(new ButtonListener());
            contact=new JLabel("contacts");contact.setBounds(5,40,150,20);  contact.setForeground(Color.red); contact.setFont(new Font ("Calabri",Font.BOLD, 20));
            sortByFirstName= new JButton("sortByFirstName"); sortByFirstName.setBounds(5,100,170,25);sortByFirstName.addActionListener(new ButtonListener());
            sortByLastName= new JButton("sortByLastName"); sortByLastName.setBounds(5,150,170,25); 
            sortByCity= new JButton("sortByCity");sortByCity.setBounds(5,200,140,25);
            addNewContact= new JButton("addNewContact");addNewContact.setBounds(5,250,160,25);addNewContact.addActionListener(new ButtonListener());
            view= new JButton("view");     view.setBounds(330,430,90,25);view.addActionListener(new ButtonListener());
            update= new JButton("update"); update.setBounds(425,430,90,25);update.addActionListener(new ButtonListener());
            delete1= new JButton("delete"); delete1.setBounds(520,430,90,25);delete1.addActionListener(new ButtonListener());
            
             panel2.setLayout(null);
             panel2.add(contact);
             panel2.add(gestionContacts2);
             panel2.add(sortByFirstName);
             panel2.add(sortByLastName);
             panel2.add(sortByCity);
             panel2.add(addNewContact);
             panel2.add(view);
             panel2.add(update);
             panel2.add(delete1);
             panel2.add(searchIn);
             panel2.add(search);
             panel2.add(pane1);
             panel2.add(panel12);
            
             
              
              
              //ici j'ai crees une nouvelle fenetre(New Contact) pour ajoutter des contact et j'ai mis une JFrame de dans
              //et j'ais mis 3 search bar pour ajouter leur nom et une table pour leur numero et je les dans cette JFrame
              
                project2= new JFrame("project NFA035");
                panel3= new JPanel();
            project2.getContentPane().add (panel3);
            project2.setBounds(400,200,700,500);project2.setVisible(false);
              
            String  firstRow2[]={"Region code","Phone number"};
            String data1[][]={
                         {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                    {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null} 
            };
            
            
            tabel1= new JTable(data1,firstRow2);
            tabel1.setBounds(230,150,400,112);
            tabel1.setFillsViewportHeight(true);
              
             JScrollPane pane2= new JScrollPane(tabel1);pane2.setBounds(220,117,450,132);
            
             newContact=new JLabel("New Contact");newContact.setBounds(5,70,150,30);  newContact.setForeground(Color.red); newContact.setFont(new Font ("Calabri",Font.BOLD, 20));
             save1 =new JButton("save");save1.setBounds(300,430,100,25);save1.addActionListener(new ButtonListener());
             cancel1 =new JButton("cancel");cancel1.setBounds(410,430,100,25);cancel1.addActionListener(new ButtonListener());
              
               gestionContacts3= new JLabel("Gestion Des Contacts");  gestionContacts3.setBounds(150,0,350,50); gestionContacts3.setBackground(Color.red);
               gestionContacts3.setForeground(Color.blue); gestionContacts3.setFont(new Font ("Calabri",Font.BOLD, 20));
            
              firstName1= new JLabel("First name");firstName1.setBounds(220,40,200,20);
              lastName1= new JLabel("Last name");lastName1.setBounds(220,60,200,20);
              city1= new JLabel("City");city1.setBounds(220,80,200,20);
              phoneNumber1= new JLabel("Phone Number");phoneNumber1.setBounds(290,100,200,20);
              
              firstNameIN1=new JTextField();firstNameIN1.setBounds(280,40,400,20);
              lastNameIn1=new JTextField();lastNameIn1.setBounds(280,60,400,20);
              cityIn1=new JTextField();cityIn1.setBounds(240,80,430,20);
              
              addTheContactToGroup=new JLabel("Add the contact to group");addTheContactToGroup.setBounds(350,252,150,20);
          
         
          
            
             
             
              
              panel13= new JPanel();
              
              
            
             
              
              panel3.setLayout (null);panel13.setBackground(Color.CYAN);panel13.setBounds(130,50,80,400);
              panel3.add(newContact);
              panel3.add(pane2);
              panel3.add(save1);
              panel3.add(cancel1);
              panel3.add(firstNameIN1);
              panel3.add(lastNameIn1);  
              panel3.add(cityIn1);
              panel3.add(city1);
              panel3.add(firstName1);
              panel3.add(lastName1); 
              panel3.add(phoneNumber1); 
              panel3.add(gestionContacts3);
              panel3.add(panel13);
              panel3.add(addTheContactToGroup);
              
              
             
              
              //ici j'ai crees une nouvelle fenetre(Update Contacts) pour modifer des contact sauvgarder et j'ai mis une JFrame de dans
               //et j'ais mis 3 search bar pour modifier leur nom et une table pour leur numero et je les dans cette JFrame
                project3= new JFrame("project NFA035");
                panel4= new JPanel();
            project3.getContentPane().add (panel4);
            project3.setBounds(400,200,700,500);project3.setVisible(false);
              String firstRow3[]={"Region code","phone number"};
            String data2[][]={
               {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                    {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null}
            };
            
            
            tabel2= new JTable(data2,firstRow3);
            tabel2.setBounds(230,150,400,112);
            tabel2.setFillsViewportHeight(true);
              
               JScrollPane pane3= new JScrollPane(tabel2);pane3.setBounds(200,117,470,140);
              modifyContactGroups=new JLabel("modify contact groups");modifyContactGroups.setBounds(350,252,150,20);
              UpdateContact=new JLabel("Update Contacts");UpdateContact.setBounds(5,40,200,30);  UpdateContact.setForeground(Color.red); UpdateContact.setFont(new Font ("Calabri",Font.BOLD, 20));
              save2= new JButton("save");save2.setBounds(300,430,100,25);save2.addActionListener(new ButtonListener());
              cancel2= new JButton("cancel");cancel2.setBounds(410,430,100,25);cancel2.addActionListener(new ButtonListener());
              
               gestionContacts4= new JLabel("Gestion Des Contacts");  gestionContacts4.setBounds(200,0,350,50); gestionContacts4.setBackground(Color.red);
               gestionContacts4.setForeground(Color.blue); gestionContacts4.setFont(new Font ("Calabri",Font.BOLD, 20));
            
              firstName2= new JLabel("First name");firstName2.setBounds(190,40,200,20);
              lastName2= new JLabel("Last name");lastName2.setBounds(190,60,200,20);
              city2= new JLabel("City");city2.setBounds(190,80,200,20);
              phoneNumber2= new JLabel("Phone Number");phoneNumber2.setBounds(280,100,200,20);
              
              firstNameIN2=new JTextField();firstNameIN2.setBounds(250,40,400,20);
              lastNameIn2=new JTextField();lastNameIn2.setBounds(250,60,400,20);
              cityIn2=new JTextField();cityIn2.setBounds(220,80,430,20);
              
          
            
                        
               
           
              
              panel14= new JPanel();
              panel14.setLayout (null);panel14.setBackground(Color.CYAN);panel14.setBounds(165,40,20,450);
              
              panel4.setLayout (null);
               
              panel4.add(UpdateContact);
              panel4.add(save2);
              panel4.add(cancel2);
              panel4.add(firstNameIN2);
              panel4.add(cityIn2);
              panel4.add(city2);
              panel4.add(firstName2);
              panel4.add(lastName2); 
              panel4.add(lastNameIn2); 
              panel4.add(phoneNumber2); 
              panel4.add(gestionContacts4);
              panel4.add(panel14);
              panel4.add(pane3);
              panel4.add(modifyContactGroups);
              
             
              
               
      //ici j'ai crees une nouvelle fenetre(Groups) pour ajjouter des Group et j'ai mis une JFrame de dans
     //et des button pour ajouter et modifier les group et 2 list pour les afficher et leur contact  et je les est mis dans cette JFrame
            project4= new JFrame("project NFA035");
            panel5= new JPanel();
            project4.getContentPane().add (panel5);
            project4.setBounds(400,200,700,500);project4.setVisible(false);
               
               
                 String firstRow4[]={"group name","number of contact"};
            String data3[][]={
                      {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                    {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                                             {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                    {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null}
            };
            
            
            tabel3= new JTable(data3,firstRow4);
            tabel3.setFillsViewportHeight(true);
            tabel3.setBounds(300,100,300,142);
           
                JScrollPane pane4= new JScrollPane(tabel3,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);pane4.setBounds(320,100,300,142);
                 String firstRow5[]={"contact name","contact city"};
            String data4[][]={
          {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},                 {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                    {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                                             {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                    {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null}
            };
            
            
            
            tabel3.addMouseListener(new Jtable());
            
            
            
            
            
            
            
            tabel4= new JTable(data4,firstRow5);
            tabel4.setBounds(300,250,300,162);
            tabel4.setFillsViewportHeight(true);
               
              
               panel15= new JPanel();panel15.setBackground(Color.CYAN);panel15.setBounds(165,40,150,450);
               panel5.setLayout(null);
               JScrollPane pane5= new JScrollPane(tabel4,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);pane5.setBounds(320,250,300,142);
               
              groupLabel= new JLabel("Groups");groupLabel.setBounds(10,40,100,40);  groupLabel.setForeground(Color.red); groupLabel.setFont(new Font ("Calabri",Font.BOLD, 16));
              addNewgroups= new JButton("add new groups"); addNewgroups.setBounds(10,100,150,25);addNewgroups.addActionListener(new ButtonListener());
              listOfGroups= new JLabel("List Of groups"); listOfGroups.setBounds(400,30,100,50);
              gestionContacts5= new JLabel("Gestion Des Contacts");  gestionContacts5.setBounds(180,0,350,30);
              gestionContacts5.setForeground(Color.blue); gestionContacts5.setFont(new Font ("Calabri",Font.BOLD, 20));           
              upddateGroup= new JButton("Upddate Group");upddateGroup.setBounds(320,420,150,25);upddateGroup.addActionListener(new ButtonListener());
              delete3= new JButton("Delete");delete3.setBounds(480,420,100,25);delete3.addActionListener(new ButtonListener());

              panel5.add(groupLabel);
              panel5.add(addNewgroups);
              panel5.add(listOfGroups); 
              panel5.add(gestionContacts5); 
              panel5.add(upddateGroup);
              panel5.add(delete3);
              panel5.add(panel15);
              panel5.add(pane5);
              panel5.add(pane4);
              
              tabel4.addMouseListener(new Jtable());
              
           
            
      //ici j'ai crees une nouvelle fenetre(add new groups) pour ajjouter des Group et j'ai mis une JFrame de dans
     //et des button pour sauvgarder et anuller les group et une list pour ajoutter ces contact dans le group et je les mis dan dans cette JFrame
              project5= new JFrame("project NFA035");
              panel6= new JPanel();
            project5.getContentPane().add (panel6);
            project5.setBounds(400,200,700,500);project5.setVisible(false);
            
      
         
        
       
                String firstRow6[]={"contact name","city","add to group"};
            Object data5[][]={
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
            {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
             {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
            {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
            {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)}
            };
        DefaultTableModel model32 = new DefaultTableModel(data5,firstRow6);
        tabel5 = new JTable(model32){
       public Class getColumnClass(int column) {
switch (column) {
case 0: return String.class;
case 1: return String.class;
default: return Boolean.class; }
};
        };

            tabel5.setBounds(405,120,300,270);
            tabel5.setFillsViewportHeight(true);
            JScrollPane pane6= new JScrollPane(tabel5);pane6.setBounds(205,120,450,270);
    
            
          


         
         
         
            panel16= new JPanel();panel16.setBackground(Color.CYAN);panel16.setBounds(135,40,70,400);
            panel6.setLayout (null);
              
            gestionContacts6= new JLabel("Gestion Des Contacts");  gestionContacts6.setBounds(150,0,350,50); gestionContacts6.setBackground(Color.red);
            gestionContacts6.setForeground(Color.blue); gestionContacts6.setFont(new Font ("Calabri",Font.BOLD, 20)); 
             
            k= new JLabel("Add new Group");k.setBounds(10,40,150,40);  k.setForeground(Color.red); k.setFont(new Font ("Calabri",Font.BOLD, 16));
            groupName1= new JLabel("Group name"); groupName1.setBounds(208,50,200,20);
            groupName1IN= new JTextField();groupName1IN.setBounds(278,50,380,20);
            description1=new JLabel("Description");description1.setBounds(208,85,200,20);
            description1IN=new JTextField();description1IN.setBounds(278,85,380,20);
            saveGroup1=new JButton("save group"); saveGroup1.setBounds(280,430,100,25);saveGroup1.addActionListener(new ButtonListener());
            cancel3=new JButton("cancel");  cancel3.setBounds(400,430,100,25);cancel3.addActionListener(new ButtonListener());
     
            panel6.add(pane6);
            panel6.add(k);
            panel6.add(groupName1);
            panel6.add(groupName1IN);
            panel6.add(description1); 
            panel6.add(description1IN); 
            panel6.add(saveGroup1);
            panel6.add(gestionContacts6);
            panel6.add(cancel3);
            panel6.add(panel16);
            
            
           
            
      //ici j'ai crees une nouvelle fenetre(update groups) pour modifier des Group et j'ai mis une JFrame de dans
     //et des button pour sauvgarder et anuller les group et une list pour modifier ces contact dans le group et je les mis dan dans cette JFrame
            project6= new JFrame("project NFA035");
            panel7= new JPanel();
            project6.getContentPane().add (panel7);
            project6.setBounds(400,200,700,500);project6.setVisible(false);
            
              String firstRow7[]={"contact name","city","add to group"};
            Object data6[][]={
               {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
            {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
            {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                  {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
            {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
            {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},      {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   
        {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},  
                {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)},
                     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    
     {null,null,new Boolean(false)},  {null,null,new Boolean(false)},   {null,null,new Boolean(false)},  {null,null,new Boolean(false)},    {null,null,new Boolean(false)},  {null,null,new Boolean(false)}
            };
        DefaultTableModel model33 = new DefaultTableModel(data5,firstRow6);
        tabel6 = new JTable(model33){
       public Class getColumnClass(int column) {
switch (column) {
case 0: return String.class;
case 1: return String.class;
default: return Boolean.class; }
};
        };
            tabel6.setBounds(420,120,300,250);
            tabel6.setFillsViewportHeight(true);
            JScrollPane pane7= new JScrollPane(tabel6);pane7.setBounds(205,120,450,270);
            
           
            panel17= new JPanel();panel17.setBackground(Color.CYAN);panel17.setBounds(135,40,70,400);
            panel7.setLayout (null);
              
            gestionContacts7= new JLabel("Gestion Des Contacts");  gestionContacts7.setBounds(150,0,350,50); gestionContacts7.setBackground(Color.red);
            gestionContacts7.setForeground(Color.blue); gestionContacts7.setFont(new Font ("Calabri",Font.BOLD, 20)); 
              
             updateNewGroup= new JLabel("Update Group");updateNewGroup.setBounds(10,40,200,40);  updateNewGroup.setForeground(Color.red); updateNewGroup.setFont(new Font ("Calabri",Font.BOLD, 16));
              groupName2= new JLabel("Group name"); groupName2.setBounds(208,50,200,20);
            groupName2IN= new JTextField();groupName2IN.setBounds(278,50,380,20);
            description2=new JLabel("Description");description2.setBounds(208,85,200,20);
            description2IN=new JTextField();description2IN.setBounds(278,85,380,20);
            saveGroup2=new JButton("save group"); saveGroup2.setBounds(280,430,100,25);saveGroup2.addActionListener(new ButtonListener());
            cancel4=new JButton("cancel");  cancel4.setBounds(400,430,100,25);cancel4.addActionListener(new ButtonListener());
           
            panel7.add(pane7);  
            panel7.add(groupName2);
            panel7.add(groupName2IN);
            panel7.add(description2); 
            panel7.add(description2IN); 
            panel7.add(saveGroup2);
            panel7.add(gestionContacts7);
            panel7.add(cancel4);
            panel7.add(updateNewGroup);
            panel7.add(panel17);  
              
          
            
             //ici j'ai crees une nouvelle fenetre(Update Contact) pour voir des contact sauvgarder et j'ai mis une JFrame de dans
               //et j'ais mis 3 search bar pour afficher leur nom et une table pour leur numero et je les dans cette JFrame
               
             project7= new JFrame("project NFA035");
            panel8= new JPanel();
            project7.getContentPane().add (panel8);
            project7.setBounds(400,200,700,500);project7.setVisible(false);
            
             String firstRow10[]={"Region code","phone number"};
            String data10[][]={
                          {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                    {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},
                                            {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},{null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null},  {null,null},  {null,null},{null,null},{null,null}, {null,null}, {null,null} ,{null,null}, {null,null}
            };
          tabel8= new JTable(data10,firstRow10);
            tabel8.setBounds(230,150,400,112);
            tabel8.setFillsViewportHeight(true);
              
              JScrollPane pane8= new JScrollPane(tabel8);pane8.setBounds(230,150,430,140);
            JLabel  modifyContactGroups1=new JLabel("contact groups");modifyContactGroups1.setBounds(280,290,150,20);
            JLabel  UpdateContact1=new JLabel("Update Contacts");UpdateContact1.setBounds(5,40,200,30);  UpdateContact1.setForeground(Color.red); UpdateContact1.setFont(new Font ("Calabri",Font.BOLD, 20));
          

                    
                    
                      gestionContacts8= new JLabel("Gestion Des Contacts");  gestionContacts8.setBounds(300,0,350,50); gestionContacts8.setBackground(Color.red);
               gestionContacts8.setForeground(Color.blue); gestionContacts8.setFont(new Font ("Calabri",Font.BOLD, 20));
            
              firstName8= new JLabel("First name");firstName8.setBounds(190,40,200,20);
              lastName8= new JLabel("Last name");lastName8.setBounds(190,60,200,20);
              city8= new JLabel("City");city8.setBounds(190,80,200,20);
              phoneNumber8= new JLabel("Phone Number");phoneNumber8.setBounds(280,100,200,20);
              
              firstNameIN8=new JTextField();firstNameIN8.setBounds(250,40,200,20);
              lastNameIn8=new JTextField();lastNameIn8.setBounds(250,60,200,20);
              cityIn8=new JTextField();cityIn8.setBounds(220,80,230,20);
              
          
              
                panel18= new JPanel();
              panel18.setLayout (null);panel18.setBackground(Color.CYAN);panel18.setBounds(165,40,20,400);
              
              
              panel8.setLayout (null);
              panel8.add(firstNameIN8); 
              panel8.add(cityIn8);
              panel8.add(city8);
              panel8.add(firstName8);
              panel8.add(lastName8); 
              panel8.add(lastNameIn8); 
              panel8.add(phoneNumber8); 
              panel8.add(gestionContacts8);
              panel8.add(panel18);
              panel8.add(pane8);
               panel8.add(UpdateContact1);
              panel8.add(modifyContactGroups1);
              
    }
    
    
    public static void main(String[] args) {
        
  ProjectFinalJava3 t=new ProjectFinalJava3();

  
    }
    
  //cetter function me permer de savoir ci le numer sauvgarder n'est pas un chiffre
  //dans la deuxieme loop elle compare tout les character et elle donne une valeur bool 
  //si une lettre faux,si un chiffre vrais
 
  public Boolean StringDig(JTable a){
      int Row=a.getRowCount();
      int column=a.getColumnCount();

      for(int j=0;j<a.getRowCount();j++){
      for(int i=0;i<a.getValueAt(j,0).toString().length();i++){
      if(a.getValueAt(j,0).toString().charAt(i)<='z'&&a.getValueAt(j,0).toString().charAt(i)>='a' ){
          
           return false;
      }
    
      }}return true;}
  
   //cetter function me permer de savoir ci le region code sauvgarder n'est pas un chiffre
   public Boolean StringDig2(JTable a){
      int Row=a.getRowCount();
      int column=a.getColumnCount();

      for(int j=0;j<a.getRowCount();j++){
      for(int i=0;i<a.getValueAt(j,1).toString().length();i++){
      if(a.getValueAt(j,1).toString().charAt(i)<='z'&&a.getValueAt(j,1).toString().charAt(i)>='a' ){
          
           return false;
      }
    
      }}return true;}
  
  
  //cette function me permet de afficher le numer de telephone du contact selectioner
public void tableR2(JTable tableSet){
   
        for(int i=0;i<tableSet.getRowCount();i++){
             listIndex=list1.getSelectedIndex();
                       tableSet.setValueAt(ContactArray.get(listIndex).phoneNumber[i], i,1);
                       tableSet.setValueAt(ContactArray.get(listIndex).regionCode[i],  i,0);
        }}
    
     





            
  
 //cette function ne less pas le persone de creat un contact si il ni ya pas un numero 
//cette function donne une valeur Boolean qui est utiliser dans une condition
public Boolean tableTest(JTable a){
    
    
    for(int i=0;i<a.getRowCount();i++){
        if(a.getValueAt(i,0)==""||a.getValueAt(i,1)==""){return true;}else  return false;
            
 
}  return false;}
    

//cette function permet de trier les nom des contact
//elle trie les ArrayList puis elle trie les nom de la class contact
     public void sortFirstName(){

             Collections.sort(JListArray);
          for(int i=0;i<model.size();i++){
             
              model.setElementAt(JListArray.get(i),i);
          }
          
           Collections.sort(ContactArray ,new Comparator<contact>() {
             
              public int compare(contact o1, contact o2) {
                 return String.valueOf(o1.Fname).compareTo(o2.Fname);
              }
          });
     }
     
     //cette function permet de recher un contact a partier de son nom
    //elle prend une list de string et un String pour filtrer,la loop check to les element
     // la premier if:Si le String S ne commence pas par le  premier character du String
     //si la premier if est vrais la deuxiem if check si s est dans la list, si vrais enleve S
     //else si elle est commence le  premier character du String et elle n'est pas dans la list on l'ajout
       public void filterModel(DefaultListModel<String> model, String filter) {
        
        for (String s : JListArray) {
            if (!s.startsWith(filter)) {
                if (model.contains(s)) {
                    model.removeElement(s);
                }
            } else {
                if (!model.contains(s)) {
                    model.addElement(s);
                }
            }
        }
    }
       
       
       //cette class nous permet de ajouter un action pour la table
   private class Jtable implements MouseListener {
        public void mouseClicked(MouseEvent e) {     
            
              Object ob = e.getSource();

        //les premier variable pour voir obtenir les index de la table
        //la premier loop pour suprimer tous les ancient contenue de la table des contact
        //si la columne choisi n'est pas vide: la loop affiche les contact de cette group
           if(tabel3==ob){
                   RowIndex3=tabel3.getSelectedRow();
                   ColumnIndex3=tabel3.getSelectedColumn();
                   
                   
                  
                    for(int i=0;i<tabel4.getRowCount();i++){
                        tabel4.setValueAt("", i, 0); 
                        tabel4.setValueAt("", i, 1); 
                    }
                    
                      if(tabel3.getValueAt(RowIndex3, ColumnIndex3)==null){
                 JOptionPane.showMessageDialog(null,"Selectioner un group S'il vous plais");  
                                                                                     }else{
                        for(int i=0;i<GroupArray.get(RowIndex3).contactIn.size();i++){
       tabel4.setValueAt(GroupArray.get(RowIndex3).contactIn.get(i).Fname, i, 0); 
       tabel4.setValueAt(GroupArray.get(RowIndex3).contactIn.get(i).City, i, 1);
        tabel3.setValueAt((String)" "+GroupArray.get(RowIndex3).contactIn.size(), RowIndex3, 1);
                      }
         
         }
          
        }
        
           //les premier variable pour voir obtenir les index de la table
           //si la columne selectioner n'est pas vide
           //elle ouvre la fenettre pour voire les detaile du contact
           //cette function march a partier une loop qui vois si le nom du contact est le meme nom de la table 
           
         if(tabel4==ob){
        
               int  RowIndex4=tabel4.getSelectedRow();
                 int  ColumnIndex4=tabel4.getSelectedColumn();
                 
                  
                  
                if(tabel4.getValueAt(RowIndex4, ColumnIndex4)==null){
                 JOptionPane.showMessageDialog(null,"Selectioner un contact S'il vous plais");  
                                                                                     }else{
                    
                      
                    
                     for(int i=0;i<ContactArray.size();i++){
                         
                         if(ContactArray.get(i).Fname==tabel4.getValueAt(RowIndex4, ColumnIndex4)||ContactArray.get(i).City==tabel4.getValueAt(RowIndex4, ColumnIndex4)){
                             
                       lastNameIn8.setText( ContactArray.get(i).Fname);      
                       firstNameIN8.setText( ContactArray.get(i).Lname);        
                       cityIn8.setText( ContactArray.get(i).City); 
                       
                          for(int j=0;j<tabel8.getRowCount();j++){
          
                       tabel8.setValueAt(ContactArray.get(i).phoneNumber[j], j,1);
                       tabel8.setValueAt(ContactArray.get(i).regionCode[j],  j,0);
        }
                       
                           project7.setVisible(true);
                         }
                         
                         
                         
                     }
                      
                        
                      
                                
                       
                 }
        }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
          
        }

         @Override
        public void mouseEntered(MouseEvent e) {
         }

       
        @Override
        public void mouseExited(MouseEvent e) {
          
        }
     }
   
   
   
   
   
   
   
   
   
   
   private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
      
        
          
          
          
          
           if(searchIn==ob){
               filterModel(model,searchIn.getText());   
          }
           
        
        if(sortByFirstName==ob){  
               if(searchIn.getText()!=""){
                 JOptionPane.showMessageDialog(null,"");  
                                                                                     }else{
       sortFirstName();
        }}
      
        
      
        //cette function permette de suprimer un group
        //premier if pour si il n'a rien selectioner demander pour selectioner
        //la columne selection devien null et on enleve le group de la list des group
        //la premier loop pour avancer tous les group qui sont avant
        //la deuxieme loop pour enlever le nom des contact du deuxiem tableaux
        
                 if(delete3==ob){ 
                        RowIndex3=tabel3.getSelectedRow();
                   ColumnIndex3=tabel3.getSelectedColumn();
                 if(tabel3.getSelectedColumn()==-1&&tabel3.getSelectedRow()==-1||tabel3.getValueAt(RowIndex3, ColumnIndex3)==null){
                 JOptionPane.showMessageDialog(null,"Selectioner un group S'il vous plais");  
                                                                                     }else{
                   
                     tabel3.setValueAt("", RowIndex3, 0);
                     tabel3.setValueAt("", RowIndex3, 1);
                     GroupArray.remove(RowIndex3);
                     countGroup--;
                     
                  panel4.remove(CheckBoxArray1.get(RowIndex3));
                  panel3.remove(CheckBoxArray2.get(RowIndex3));
               
                  
                 CheckBoxArray1.remove(RowIndex3);
                 CheckBoxArray2.remove(RowIndex3);
                
                       
                      countBox--;
                     for(int i=0;i<7;i++){
                         if(tabel3.getValueAt(i,0)== ""&&tabel3.getValueAt(i+1,0)!= ""){
                             tabel3.setValueAt(tabel3.getValueAt(i+1,0) ,i,0);
                             tabel3.setValueAt(tabel3.getValueAt(i+1,1) ,i,1);
                             
                              tabel3.setValueAt("" ,i+1,0);
                             tabel3.setValueAt("" ,i+1,1);
                         }
                     }
                     
                      for(int i=0;i<8;i++){
                          for(int j=0;j<2;j++){
                           tabel4.setValueAt("", i, j);
                           tabel4.setValueAt("", i, j);
 
                        }}
                         
                    
                 }}
        
                 
                 
                 
                 
                 //cette function permette de modifier un group
                //premier if pour si il n'a rien selectioner demander pour selectioner
               //la deuxiem loop pour suprimer tous les ancient contenue des contact dans la table
               //la deuxiem loop pour ajouter tous les nouveux contenue des contact dans la table
               //la troisieum loop check si le contact est dans la list a partire de sont nom et ajout trous au check box
                  if(upddateGroup==ob){ 
                     
                     RowIndex3=tabel3.getSelectedRow();
                   ColumnIndex3=tabel3.getSelectedColumn();
                    
                      
               if(tabel3.getSelectedColumn()==-1&&tabel3.getSelectedRow()==-1||tabel3.getValueAt(RowIndex3, ColumnIndex3)==null){
                 JOptionPane.showMessageDialog(null,"Selectioner un group S'il vous plais");  
                                                                                     }else{

                     
                     
                     
        groupName2IN.setText(GroupArray.get(RowIndex3).Gname);
        description2IN.setText(GroupArray.get(RowIndex3).Gdescription);
        
          for(int i=0;i<tabel6.getRowCount();i++){
                           tabel6.setValueAt(" ", i, 0);
                           tabel6.setValueAt(" ", i, 1);
                               tabel6.setValueAt(false,i,2);
                        }
          
          
//           for(int i=0;i<ContactArray.size();i++){
//                tabel6.setValueAt(false,i,2);
//           }
           
           for(int i=0;i<ContactArray.size();i++){

               
                           tabel6.setValueAt(ContactArray.get(i).Fname+" "+ContactArray.get(i).Lname , i, 0);
                           tabel6.setValueAt(ContactArray.get(i).City, i, 1);
                           
                           for(int j=0;j<GroupArray.get(RowIndex3).contactIn.size();j++){
                           if(GroupArray.get(RowIndex3).contactIn.get(j)==ContactArray.get(i)){
                                tabel6.setValueAt(true,i,2);
                           }
                        }
        
        project6.setVisible(true);
        
        
    }}}
                  
                  
     
 //on cree un nouvelle group qui a un nom une description et une list des contact et on l'ajout dans une ArrayList
 //dans la class group j'ais mis tout les contact dans la list des contact
 //la premier loop vois si le check box est false elle enleve le contact de la list
 //et elle cree un nouvelle checkBox dans la fenetre add et update contact
               
    if(saveGroup1==ob){

          group newGroup= new group(groupName1IN.getText(),description1IN.getText(),ContactArray);  
           int countBox1=0,checkBoxheight1=0;
      
        
        GroupArray.add(newGroup);
 
                  
   
          
         
         
                for(int i=ContactArray.size();i>0;i--){
                    if((Boolean)tabel5.getValueAt(i-1, 2)==false){
                   GroupArray.get(countGroup).contactIn.remove(i-1);

                    }else{
//         JCheckBox GCheckBox3=new JCheckBox(GroupArray.get(countGroup).Gname);GCheckBox3.setBounds(250,320+checkBoxheight1,100,20);
//         GCheckBox3.setSelected(true);
//         
//         CheckBoxArray3.add(GCheckBox3);
// 
//             checkBoxheight1+=20; 
//      
//                         
//          panel8.add(CheckBoxArray3.get(countBox1));
//          countBox1++;
          
                    }
                }
               tabel3.setValueAt(GroupArray.get(countGroup).Gname, countGroup, 0);
         tabel3.setValueAt((String)" "+GroupArray.get(countGroup).contactIn.size(), countGroup, 1);
         
         
          JCheckBox GCheckBox1=new JCheckBox(GroupArray.get(countGroup).Gname);GCheckBox1.setBounds(250,320+checkBoxheight,100,20);
          JCheckBox GCheckBox2=new JCheckBox(GroupArray.get(countGroup).Gname);GCheckBox2.setBounds(250,320+checkBoxheight,100,20);

          
         CheckBoxArray1.add(GCheckBox1);
         CheckBoxArray2.add(GCheckBox2);
         panel3.add(CheckBoxArray1.get(countBox));
         panel4.add(CheckBoxArray2.get(countBox));
         
        
       
        if(checkBoxheight<100){
             checkBoxheight+=20; 
        }
         
      countBox++;
         countGroup++;
          project5.setVisible(false);
            
        }
        
      
          
         
 //cette function permet de modifier le group
 //la premier loop pour anuller le contecue de la table
 //j'enleve tout les contact de la list 
 //la deuxiem loop si le checkBox est vraie il l'ajout le contact aux group
 
    
    if(saveGroup2==ob){
        
            for(int i=0;i<tabel4.getRowCount();i++){
                        tabel4.setValueAt("", i, 0); 
                        tabel4.setValueAt("", i, 1); 
                    }
            
                         GroupArray.get(RowIndex3).Gname=groupName2IN.getText();        
                         GroupArray.get(RowIndex3).Gdescription=description2IN.getText(); 
                         
                        
                             GroupArray.get(RowIndex3).contactIn.clear();
                         
              
                                  for(int i=0;i<ContactArray.size();i++){
                    if((Boolean)tabel6.getValueAt(i, 2)==true){
                   GroupArray.get(RowIndex3).contactIn.add(ContactArray.get(i));
                    }
                }
                                  
                          
                         tabel3.setValueAt(GroupArray.get(RowIndex3).Gname, RowIndex3, 0);
                         tabel3.setValueAt((String)" "+GroupArray.get(RowIndex3).contactIn.size(), RowIndex3, 1);
                    
                       
                         project6.setVisible(false);
        
    }
        
         
    
       
          
          //cette function sauvgarde tous les modification du contact
          //la premier condition si le contact n'est pas complet un OptionPane apear
          //la deuxiem condition si le numero n'est pas des chiffre  un OptionPane apear
          //la loop sauvgarde les numero des contact mis dans le tableaux
          // et je les modifier dans la JList
           if(save2==ob){
               
              if(firstNameIN2.getText()==""||lastNameIn2.getText()==""||cityIn2.getText()==""||tabel2.getValueAt(0,0)==""||tabel2.getValueAt(0,1)==""){
                 JOptionPane.showMessageDialog(null,"un contact doit avoir un nom,un prenom et un numero de telephone");  
                                                   }else{
              
                  
                   if(StringDig(tabel2)&&StringDig2(tabel2)==true){ 
                       
                   
                          listIndex=list1.getSelectedIndex();
                         
                         ContactArray.get(listIndex).Lname=lastNameIn2.getText();        
                         ContactArray.get(listIndex).Fname=firstNameIN2.getText();        
                         ContactArray.get(listIndex).City=cityIn2.getText();
                         
                         for(int i=0;i<tabel2.getRowCount();i++){
                         ContactArray.get(listIndex).regionCode[i]=  (String)tabel2.getValueAt(i,0);
                         ContactArray.get(listIndex).phoneNumber[i]= (String)tabel2.getValueAt(i,1);
                         }
                         

                         JListArray.set(listIndex,ContactArray.get(listIndex).Fname+" "+ContactArray.get(listIndex).Lname+" "+ContactArray.get(listIndex).City);
                         model.setElementAt(JListArray.get(listIndex) ,listIndex);
                         
                      sortFirstName();

                         project3.setVisible(false);
                         
                   }else{
               
                JOptionPane.showMessageDialog(null,"un numero ne doit pas avoir des chiffres");
                
        }}}
           
           //cette function me permet d'ajouter de nouveaux contact
            //la premier condition si le contact n'est pas complet un OptionPane apear
          //la deuxiem condition si le numero n'est pas des chiffre  un OptionPane apear
           //je cree un nouveaux contact et je le met dans un ArrayList
           //puise je mes le nom,prenom,city dans un nouveaux arrayList qui sera afficher dans JList
           //puis si le check box est true j'ajoutte le contact dans le group selectionner
         if(save1==ob){

                 if (firstNameIN1.getText()==""||lastNameIn1.getText()==""||cityIn1.getText()==""||tableTest(tabel1)==true){
                 JOptionPane.showMessageDialog(null,"un contact doit avoir un nom,un prenom et un numero de telephone");  
                
                 
                      
                      
                 }else 
                 
                if(StringDig(tabel1)&&StringDig2(tabel1)==true){ 

                    
                    contact newlyContact= new contact(firstNameIN1.getText(),lastNameIn1.getText(),cityIn1.getText(),tabel1,tabel1);                                       
            ContactArray.add(newlyContact);
        
         
          
            JListArray.add(ContactArray.get(count).Fname+" "+ContactArray.get(count).Lname+" "+ContactArray.get(count).City);
            model.addElement(JListArray.get(count));
            list1.setModel(model);
            lastNameIn1.setText("");        
            firstNameIN1.setText("");        
            cityIn1.setText("");
             
                        for(int i=0;i<CheckBoxArray1.size();i++){
                if(CheckBoxArray1.get(i).isSelected()==true){
                    
                       GroupArray.get(i).contactIn.add(ContactArray.get(count));
                    CheckBoxArray2.get(i).setSelected(true);
                     
                }
            }
                        
            
            count++;

           sortFirstName();
            project2.setVisible(false);
        
                     }
               else{
               
                JOptionPane.showMessageDialog(null,"un numero ne doit pas avoir des chiffres");
                
        }}
               
              
         
        //permer d'afficher le nom,prenom du contact
           if(update==ob){

          s =(String) list1.getSelectedValue();
                 if(s==null){
                 JOptionPane.showMessageDialog(null,"Selectioner un contact S'il vous plais");  
                                                                                     }else{
                     listIndex=list1.getSelectedIndex();
                       lastNameIn2.setText( ContactArray.get(listIndex).Lname);        
                       firstNameIN2.setText( ContactArray.get(listIndex).Fname);        
                       cityIn2.setText( ContactArray.get(listIndex).City); 
                       
         
                        tableR2(tabel2);

                        

                       
                        project3.setVisible(true);
                 }  
           }
               //permer d'afficher le nom,prenom du contact
               if(view==ob){ 
                       s =(String) list1.getSelectedValue();
                 if(s==null){
                 JOptionPane.showMessageDialog(null,"Selectioner un contact S'il vous plais");  
                                                                                     }else{
                     listIndex=list1.getSelectedIndex();
                       lastNameIn8.setText( ContactArray.get(listIndex).Lname);        
                       firstNameIN8.setText( ContactArray.get(listIndex).Fname);        
                       cityIn8.setText( ContactArray.get(listIndex).City); 
                        tableR2(tabel8);
                        
                      
                                
                          project7.setVisible(true);

               }}
           
           
           //permet de suprimer les contact
           //j'enleve le contact de ArrayLIst selectionner
            if(delete1==ob){
              
                     s =(String) list1.getSelectedValue();
                 if(s==null){
                 JOptionPane.showMessageDialog(null,"Selectioner un contact S'il vous plais");  
                                                                                     }else{
               
                        listIndex=list1.getSelectedIndex();
                           
                 
               
                 
                 ContactArray.remove(listIndex);
                 model.removeElement(JListArray.get(listIndex));
                 list1.setModel(model);
                 JListArray.remove(listIndex);
               count--;
                 
                 }}
            
            //pour anuller une commande
         if(cancel1==ob){
         int  reponse=JOptionPane.showConfirmDialog (null, "Vous voullez quitter cette fenettre!");
         if(reponse==JOptionPane.YES_OPTION){
                 project2.setVisible(false);
             }else{
              project2.setVisible(true);
         }
         }
           //pour anuller une commande
          if(cancel2==ob){
         int  reponse1=JOptionPane.showConfirmDialog (null, "Vous voullez quitter cette fenettre!");
         if(reponse1==JOptionPane.YES_OPTION){
             
                 project3.setVisible(false);
             }else{
              project3.setVisible(true);
         }
         
              
         }
         
  //pour ouvrir une fenetre
        if(contacts==ob){
       project1.setVisible(true);
     
    }
        //pour ouvrir une fenetre
        if(groupsButton==ob){
        project4.setVisible(true);
    }
    //pour ouvrir une fenetre qui nous lesse ajouter un contact
      if(addNewContact==ob){
         
           lastNameIn1.setText("");        
            firstNameIN1.setText("");        
            cityIn1.setText("");
            for(int i=0;i<CheckBoxArray1.size();i++){
            CheckBoxArray1.get(i).setSelected(false);
                      CheckBoxArray2.get(i).setSelected(false);
                }
           
          
          for(int i=0;i<tabel1.getRowCount();i++){
              tabel1.setValueAt("",i,0);
                tabel1.setValueAt("",i,1);
          }
      project2.setVisible(true);
      }
         
         
         //pour ouvrir une fenetre qui nous lesse ajouter un Group
        //premier deux loop pour enlever les ancient text
        //la troisiem loop pour ajouter les nom de tous les contact
      if(addNewgroups==ob){

              
                 if(ContactArray.size()==0){
                 JOptionPane.showMessageDialog(null,"il doit avoir au moin 1 contact");  
                                                                                     }else{
                     
                
                     for(int i=0;i<tabel5.getRowCount();i++){
                         
                           tabel5.setValueAt(" ", i, 0);
                           tabel5.setValueAt(" ", i, 1);
                           tabel5.setValueAt(false,i,2);
                        }
                      for(int i=0;i<tabel4.getRowCount();i++){
                         
                           tabel4.setValueAt(" ", i, 0);
                           tabel4.setValueAt(" ", i, 1);
                        }
                      
          
                        groupName1IN.setText("");
                        description1IN.setText("");
                        for(int i=0;i<ContactArray.size();i++){
                         
                           tabel5.setValueAt(ContactArray.get(i).Fname+" "+ContactArray.get(i).Lname , i, 0);
                           tabel5.setValueAt(ContactArray.get(i).City, i, 1);
                          
                        }

        project5.setVisible(true);
    }
}
            //pour fermer une fenettre
            if(close8==ob){
        project7.setVisible(false);
    }   //pour anuller une commande
          if(cancel3==ob){
        project5.setVisible(false);
    }    //pour anuller une commande
                if(cancel4==ob){
        project6.setVisible(false);
    }    
    
    }
    }
}
