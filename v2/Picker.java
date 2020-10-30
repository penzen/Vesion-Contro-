/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualPetgame;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Penzen lama
 */
public class Picker {  // do the whole thing again the long way. 

    Scanner scan = new Scanner(System.in);
    Scanner forname = new Scanner(System.in); // use this for the name or else it will not work; 

    Boolean z = true;
    Boolean main = true;
    int type = 0;
    int Predeator = 0;
    String name = " ";
    Pet Hero = new Pet() {
    };

    public Pet Type() { // the whole thing needs to be in a do while loop for it to work; 

        do {  // do while loop, which has inner try - catch, because to catch  exceptions.
            try {
                print("Pick a predeator type:");
                print("1.Mamals 2.Coldblood ");
                type = scan.nextInt();

                if (type == 1 || type == 2) {
                    z = false;
                    break;

                } else {
                    z = true;
                    throw new InvalidInput("Not a valid input, try again!!!!");
                }
            } catch (Exception e) //InputMismatchExcept needs to be put in.
            {
                print("Need a number");
                scan.nextLine(); // this cleans the buffer;
            }              // this is workings
        } while (z);

        switch (type) {
            case 1:
                Mamals io = new Mamals();
                print("Pick Name: ");
                name = forname.nextLine();
                z = true; // needs to go into the loop; 

                do {
                    try {
                        print("Mamals, choose predeator:");
                        print("1.Wolf\n 2.Lion\n 3. Ape");
                        Predeator = scan.nextInt();

                        if (Predeator == 1) {
                            io.Wolf(name);
                            System.out.println("The statistics of " + io.getName());
                            System.out.println(io);
                            main = false;
                            z = false;
                            Hero = io;
                            break;
                        } else if (Predeator == 2) {
                            io.Lion(name);
                            System.out.println("The statistics of " + io.getName());
                            System.out.println(io);
                            main = false;
                            z = false;
                            Hero = io;
                            break;
                        } else if (Predeator == 3) {
                            io.Ape(name);
                            System.out.println("The statistics of " + io.getName());
                            System.out.println(io);
                            main = false;
                            z = false;
                            Hero = io;
                            break;
                        } else {
                            z = true;
                            throw new InvalidInput("Invalid input, try again.");
                        }

                        // Hero = io; I could have done this here, but because of the break I had to itterate through all the elements.
                    } catch (Exception e) {
                        print("Invalid input, try again.");
                        z = true;
                        scan.nextLine();
                    }

                } while (z); // for case 1; 

                break; // used to break case 1;

            case 2:
                ColdBlood chill = new ColdBlood();
                print("Pick Name: ");
                name = forname.nextLine();
                z = true;
                do {
                    try {
                        print("Mamals, choose predeator:");
                        print("1.Snake\n 2.Trex\n 3. Killer Croc");

                        Predeator = scan.nextInt();
                        if (Predeator == 1) {
                            chill.snake(name);
                            System.out.println("The statistics of " + chill.getName());
                            System.out.println(chill);
                            Hero = chill;
                            break;
                        } else if (Predeator == 2) {
                            chill.Trex(name);
                            System.out.println("The statistics of " + chill.getName());
                            System.out.println(chill);
                            Hero = chill;
                            break;
                        } else if (Predeator == 3) {
                            chill.KillerCorc(name);
                            System.out.println("The statistics of " + chill.getName());
                            System.out.println(chill);
                            Hero = chill;
                            break;
                        } else {
                            z = true;
                            throw new InvalidInput("Invalid input, try again.");
                        }

                    } catch (Exception e) {
                        print("Invalid input, try again.");
                        z = true;
                        scan.nextLine();
                    }
                } while (z); //case 2

        }
        return Hero;

    }

    public void print(String n) {
        System.out.println(n);
    }

}
