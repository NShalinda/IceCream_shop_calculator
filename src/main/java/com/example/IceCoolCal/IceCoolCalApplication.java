package com.example.IceCoolCal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class IceCoolCalApplication {

	public static void main(String[] args) {

		SpringApplication.run(IceCoolCalApplication.class, args);

		Scanner s =new Scanner(System.in);

		int raspberrySlushy =0;
		int cocoCoffee = 0;
		int nuttyFruit =0;
		int pistachioDelight = 0;

		int waferCone =0;
		int waffleCone = 0;
		int waffleBowl =0;


		int sprinkles = 0;
		int toastedMarshmallow= 0;
		int toastedAlmondFlakes=0;
		int dashOfPeanutButter =0;
		int oreoCrumbles = 0;
		int driedApple =0;
		int driedMango =0;
		int driedApricot=0;
		int driedBlueberry=0;

		int choose;
		int ice;
		int condiments;
		char decision;
		String condimentsDis;
		System.out.println("");
		System.out.println("********Welcome To IceCool*********");
		System.out.println("\n----Menu----");
		System.out.println("1) Raspberry Slushy - LKR 200 per scoop\n" +
				"2) Coco Coffee - LKR 350 per scoop\n" +
				"3) Nutty Fruit - LKR 150 per scoop\n" +
				"4) Pistachio Delight - LKR 350 per scoop");

		do{
			System.out.print("Choose any item : ");
			choose = s.nextInt();

			System.out.print("How many iceCreams? ");
			ice = s.nextInt();

			switch (choose){
				case 1:
					raspberrySlushy += ice;

					System.out.println("");


					System.out.println("chose any container");

					System.out.println("1) Wafer cone - LKR 20\n"+
							"2) Waffle cone - LKR 40\n"+
							"3) Waffle bowl - LKR 50");

					System.out.print("what would you pic as a cone: ");
					int coneType= s.nextInt();

					switch (coneType){
						case 1:
							waferCone =+ ice;
							break;
						case 2:
							waffleCone =+ice;
							break;
						case 3:
							waffleBowl =+ice;
							break;
					}
					System.out.println("");

					System.out.print("Do you add eny condiments? Y/N / y/n:");
					condimentsDis = s.next();

					if(condimentsDis.equals("y") || condimentsDis.equals("Y")) {

						System.out.println("1)Sprinkles - LKR 50 \n" +
								"2) Toasted Marshmallow - LKR 100 \n" +
								"3) Dash of Peanut butter - LKR 50 per tablespoon of peanut butter\n" +
								"4) Oreo Crumbles - LKR 60 per Oreo cookie\n" +
								"5) Dried Apples - LKR 2\n" +
								"6) Dried Mango - LKR 30\n" +
								"7) Dried Apricot - LKR 40\n" +
								"8) Dried Blueberry - LKR 45");

						System.out.print("Choose any item : ");
						condiments =s.nextInt();

						switch (condiments){
							case 1:
								sprinkles =+ice;
								break;
							case 2:
								toastedMarshmallow =+ice;
								break;
							case 3:
								dashOfPeanutButter =+ice;
								break;
							case 4:
								oreoCrumbles =+ice;
								break;
							case 5:
								driedApple =+ice;
								break;
							case 6:
								driedMango =+ice;
								break;
							case 7:
								driedApricot=+ice;
								break;
							case 8:
								driedBlueberry=+ice;
								break;
						}
						break;

					}else{
						break;}

				case 2:
					cocoCoffee += ice;

					System.out.println("");

					System.out.println("chose any container");

					System.out.println("1) Wafer cone - LKR 20\n"+
							"2) Waffle cone - LKR 40\n"+
							"3) Waffle bowl - LKR 50");

					System.out.print("what would you pic as a cone: ");
					int coneType1= s.nextInt();

					switch (coneType1){
						case 1:
							waferCone =+ ice;
							break;
						case 2:
							waffleCone =+ice;
							break;
						case 3:
							waffleBowl =+ice;
							break;
					}

					System.out.print("Do you add eny condiments? Y/N / y/n:");
					condimentsDis = s.next();

					if(condimentsDis.equals("y") || condimentsDis.equals("Y")) {

						System.out.println(
								"1) Toasted Almond Flakes - LKR 150\n "+
										"2) Dash of Peanut butter - LKR 50 per tablespoon of peanut butter\n" +
										"3) Oreo Crumbles - LKR 60 per Oreo cookie\n");

						System.out.print("Choose any item : ");
						condiments =s.nextInt();

						switch (condiments){
							case 1:
								sprinkles =+ice;
								break;
							case 2:
								toastedMarshmallow =+ice;
								break;
							case 3:
								dashOfPeanutButter =+ice;
								break;
						}
						break;

					}else{
						break;}



				case 3:
					nuttyFruit += ice;
					System.out.println("");

					System.out.println("chose any container");

					System.out.println("1) Wafer cone - LKR 20\n"+
							"2) Waffle cone - LKR 40\n"+
							"3) Waffle bowl - LKR 50");

					System.out.print("what would you pic as a cone: ");
					int coneType2= s.nextInt();

					switch (coneType2){
						case 1:
							waferCone =+ ice;
							break;
						case 2:
							waffleCone =+ice;
							break;
						case 3:
							waffleBowl =+ice;
							break;
					}

					System.out.print("Do you add eny condiments? Y/N / y/n:");
					condimentsDis = s.next();

					if(condimentsDis.equals("y") || condimentsDis.equals("Y")) {

						System.out.println("");
						System.out.println("1)Sprinkles - LKR 50 \n" +
								"2) Toasted Marshmallow - LKR 100 \n" +
								"3) Dash of Peanut butter - LKR 50 per tablespoon of peanut butter\n" +
								"4) Oreo Crumbles - LKR 60 per Oreo cookie\n" +
								"5) Dried Apples - LKR 2\n" +
								"6) Dried Mango - LKR 30\n" +
								"7) Dried Apricot - LKR 40\n" +
								"8) Dried Blueberry - LKR 45" +
								"9) Toasted Almond Flakes - LKR 150");

						System.out.print("Choose any item : ");
						condiments =s.nextInt();

						switch (condiments){
							case 1:
								sprinkles =+ice;
								break;
							case 2:
								toastedMarshmallow =+ice;
								break;
							case 3:
								dashOfPeanutButter =+ice;
								break;
							case 4:
								oreoCrumbles =+ice;
								break;
							case 5:
								driedApple =+ice;
								break;
							case 6:
								driedMango =+ice;
								break;
							case 7:
								driedApricot=+ice;
								break;
							case 8:
								driedBlueberry=+ice;
								break;
							case 9:
								toastedAlmondFlakes=+ice;
								break;
						}
						break;

					}else{
						break;}

				case 4:
					pistachioDelight += ice;
					System.out.println("");
					System.out.println("chose any container");

					System.out.println("1) Wafer cone - LKR 20\n"+
							"2) Waffle cone - LKR 40\n"+
							"3) Waffle bowl - LKR 50");

					System.out.print("what would you pic as a cone: ");
					int coneType3= s.nextInt();

					switch (coneType3){
						case 1:
							waferCone =+ ice;
							break;
						case 2:
							waffleCone =+ice;
							break;
						case 3:
							waffleBowl =+ice;
							break;
					}

					System.out.print("Do you add eny condiments? Y/N / y/n:");
					condimentsDis = s.next();

					if(condimentsDis.equals("y") || condimentsDis.equals("Y")) {

						System.out.println("");
						System.out.println(
								"1) Toasted Marshmallow - LKR 100 \n" +
										"2) Dash of Peanut butter - LKR 50 per tablespoon of peanut butter\n" +
										"3) Oreo Crumbles - LKR 60 per Oreo cookie\n" +
										"4) Toasted Almond Flakes - LKR 150");

						System.out.print("Choose any item : ");
						condiments =s.nextInt();

						switch (condiments){
							case 1:
								toastedMarshmallow =+ice;
								break;
							case 2:
								dashOfPeanutButter =+ice;
								break;
							case 3:
								oreoCrumbles =+ice;
								break;
							case 4:
								toastedAlmondFlakes=+ice;
						}
						break;

					}else{
						break;}


			}


			System.out.print("Would you like to order again? Y/N / y/n: ");
			decision = s.next().charAt(0);
		}while (decision != 'n' && decision !='N');

		int totraspberrySlushy =raspberrySlushy*200;
		int totcocoCoffee = cocoCoffee*350;
		int totnuttyFruit = nuttyFruit*150;
		int totpistachioDelight = pistachioDelight*350;

		int totwaferCone = waferCone*20;
		int totwaffleCone = waffleCone*40;
		int totwaffleBowl = waffleBowl*50;

		int totsprinkles = sprinkles*50;
		int tottoastedMarshmallow = toastedMarshmallow*100;
		int tottoastedAlmondFlakes = toastedAlmondFlakes*150;
		int totdashOfPeanutButter = dashOfPeanutButter*50;
		int totoreoCrumbles = oreoCrumbles*60;
		int totdriedApple = driedApple*25;
		int totdriedMango = driedMango*30;
		int totdriedApricot =driedApricot*40;
		int totdriedBlueberry = driedBlueberry*45;

		int totPayment = totraspberrySlushy + totcocoCoffee + totnuttyFruit + totpistachioDelight+
				totwaferCone + totwaffleCone + totwaffleBowl +
				totsprinkles + tottoastedMarshmallow + tottoastedAlmondFlakes + totdashOfPeanutButter + totoreoCrumbles + totdriedApple + totdriedMango + totdriedApricot + totdriedBlueberry;

		System.out.println("");
		System.out.println("*************  BILL  ************");
		System.out.println("");

		System.out.println("-------------------------------------");
		System.out.println("Raspberry Slushy(LKR 200): "+ raspberrySlushy+" = "+totraspberrySlushy+"\n"+
				"Coco Coffee(LKR 350): "+ cocoCoffee+ " = "+totcocoCoffee + "\n"+
				"Nutty Fruit(LKR 150): "+ nuttyFruit+ " = "+totnuttyFruit+"\n"+
				"Pistachio Delight(LKR 350): "+ pistachioDelight+ " = "+totpistachioDelight+"\n");

		System.out.println("-------------------------------------");
		System.out.println("Wafer cone(LKR 50): "+waferCone+ " = "+totwaferCone+"\n"+
				"Waffle cone(LKR 100): "+waffleCone+" = "+totwaffleCone+"\n"+
				"Waffle bowl(LKR 150): "+ waffleBowl+" = "+totwaffleBowl);

		System.out.println("--------------------------------------");
		System.out.println("Sprinkles(LKR 50): "+ sprinkles+ " = "+totsprinkles+"\n"+
				"Toasted Marshmallow(LKR 100): "+ toastedMarshmallow+ " = "+tottoastedMarshmallow+"\n"+
				"Toasted Almond Flakes(LKR 150): "+ toastedAlmondFlakes+ " = "+tottoastedAlmondFlakes+"\n"+
				"Dash of Peanut butter(LKR 50): "+ dashOfPeanutButter+ " = "+totdashOfPeanutButter+"\n"+
				"Oreo Crumbles(LKR 60): "+ oreoCrumbles+ " = "+totoreoCrumbles+"\n"+
				"Dried Apples(LKR 25): "+ driedApple+ " = "+totdriedApple+"\n"+
				"Dried Mango(LKR 30): "+ driedMango+ " = "+totdriedMango+"\n"+
				"Dried Apricot(LKR 40): "+ driedApricot+ " = "+totdriedApricot+"\n"+
				"Dried Blueberry(LKR 45): "+ driedBlueberry+ " = "+totdriedBlueberry+"\n");

		System.out.println("");
		System.out.println("Total Payment = LKR "+ totPayment+".00");
	}

}
