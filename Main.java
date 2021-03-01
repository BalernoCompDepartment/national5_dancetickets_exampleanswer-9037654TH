class Main {
  public static void main(String[] args) {
    
    //1 - Get group name
    String groupName = Keyboard.getText("Please enter the name of your dance group");
    //2.1 - ask and store the number of pupils in the group as numberInGroup
    int numberInGroup = Keyboard.getInt("Please enter the number of students in your group between 4 and 10");
    //2.2 conditional loop if number in group is invalid (<4 or >10)
    while (numberInGroup < 4 || numberInGroup > 10) {
      //2.3 display an invalid entry error message
      Screen.display("Invalid number of group members","Error");
      //2.4 ask and store the number of pupils in the group as numberInGroup
      numberInGroup = Keyboard.getInt("Please enter the number of students in your group between 4 and 10");
    //2.5 end conditional loop
    } 
    //create arrays to store student names and the cost of their ticket
    String [] names = new String [numberInGroup];
    double [] ticketCosts = new double [numberInGroup];

    //3 - loop for each student in the group
    for (int index = 0; index < names.length; index ++){
      //4 get the current students name and store at index in the names array
      names[index] = Keyboard.getText("Please enter the name of student " + (index + 1));
      //5.2 Ask if pupil wants to pre-order a photo
      String photo = Keyboard.getText("Would " + names[index] + " like to order a photo [yes/no]?");

      //this section is not in the design in the task just adds robustness and is an extra example of the input validation algorithm
      while (!(photo.equals("yes")||photo.equals("no"))) {
        Screen.display("Invalid choice","Error");
        photo = Keyboard.getText("Would " + names[index] + " like to order a photo [yes/no]?");
      }
      //end of the extra section of code

      //5.3. if yes then 
      if (photo.equals("yes")) {
      // 5.4 ticket price = 4·99  
        ticketCosts[index] = 4.99;     
      //5.5 else 
      } else {
      //5.6 ticket price = 3·00  
        ticketCosts[index] = 3;
      //5.7 end If 
      }
    //6. End loop 
    }

    //7.1	create variable output as string, with initial value “group name “ the value of groupName variable “number in group” and the value in the numberIngroup variable
    String output = "Group Name: " + groupName + "\nNumber in group: " + numberInGroup + "\n";
    //7.2 fixed loop for each index in the names array starting at 0
    for (int index = 0; index < names.length; index ++) {
    //7.3 concatenate the value of current index of names array onto the output variable along with the value of current index of ticketCost
      output = output + names[index] + " £" + ticketCosts[index] + "\n";
    //7.4	end fixed loop
    }
    //7.5	display the value of the output variable on the screen
    Screen.display(output,"Ticket Costs");
  //end of program
  } 
}