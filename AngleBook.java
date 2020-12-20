int a = 60;
int b = 60;
int c = 60;
int d;


System.out.println("Choose one of the options\\n"
        + "1-Show Angles\\n"
        + "2-Update Angles\\n"
        + "3-Add angle\\n"
        + "4- Sum of angles\\n"
        + "5-Exit");

String  option = scanner.next();

switch (option){
    case "1":
        System.out.println("a =" + a
        + " b = " + b
        + " c = " + c);
        break;
    case "2":
        System.out.println("-Which angle do you want to update (a-b-c)? and enter new angle");
        String choice = scanner.next();
        int newnAngle = scanner.nextInt();

           if(choice.equals("a")){
               a = newnAngle;
               System.out.println("new a = "+ a);
           }
           else if(choice.equals("b")){
               b= newnAngle;
               System.out.println("new b = "+ b);
           }
           else if(choice.equals("c")){
               c= newnAngle;
               System.out.println("new c = "+ c);
           }
           else {
               System.out.println("enter a valid angle(a-b-c)");
           }
        break;
    case "3":
        System.out.println("Enter a value for new angle");
        int value = scanner.nextInt();
        d= value;
        System.out.println("new angle d is : "+ d);
        break;
    case "4":
        System.out.println("Sum of angles"+ (a+b+c));
        break;
    case "5":
        System.out.println("Good-Bye");
        break;
    default:
        System.out.println("Enter a valid number");
        break;

}


}
