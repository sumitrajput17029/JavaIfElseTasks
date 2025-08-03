package conditional.exercises;

import java.util.Scanner;

public class JavaIfElseTasks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		String[] questions = {
	            "Check the Number is Positive or Negative.",
	            "Check the Number is Even or Odd.",
	            "Check the Number is Divisible by 5 and 11.",
	            "Check whether a Character is Vowel or Consonant.",
	            "Check whether a Character is an Alphabet or Not.",
	            "Find the Largest of Two Numbers.",
	            "Find the Largest of Three Numbers.",
	            "Check if a Year is a Leap Year or Not.",
	            "Check if a Number is 3-digit or Not.",
	            "Check if a Number is Divisible by both 3 and 7.",
	            "Check if a Character is Uppercase or Lowercase.",
	            "Check if a Number is Zero, Positive, or Negative.",
	            "Check whether a Triangle is Valid or Not using Angles.",
	            "Find Grade Based on Marks.",
	            "Check if a Number is Within a Specific Range (10–100).",
	            "Check if a Number is Divisible by 2 or 3.",
	            "Accept Age and Check Eligibility to Vote.",
	            "Check if a Number is a Palindrome.",
	            "Accept Temperature and Suggest What to Wear.",
	            "Check whether a Person is Eligible for a Job (age 18–35).",
	            "Check whether a Triangle is Equilateral, Isosceles, or Scalene.",
	            "Check the Quadrant of a Coordinate Point (x, y).",
	            "Compare Three Numbers and Print the Second Largest.",
	            "Check if a Character is a Digit, Letter, or Special Character.",
	            "Accept Time (hours) and Print Greeting (Morning, Afternoon, Evening).",
	            "Simple Calculator using If-Else operator (+, -, *, /):.",
	            "Accept Marks of 5 Subjects and Calculate Grade and Pass/Fail.",
	            "Accept Gender and Age to Check Marriage Eligibility.",
	            "Check if a Year is a Century Year or Not.",
	            "Accept Two Numbers and an Operator and Perform the Operation.",
	            "Accept a Number and Check if it's a Perfect Square.",
	            "Check the Type of Triangle Based on Sides.",
	            "Check Whether a Student is Eligible for Scholarship.",
	            "Check Whether a Number is Armstrong.",
	            "Accept a Number and Check if Sum of its Digits is Even or Odd.",
	            "Accept a Number and Check if it Ends with 5.",
	            "Accept Month Number and Print Season.",
	            "Accept Day Number (1 to 7) and Print Weekday Name.",
	            "Accept Electricity Units and Calculate Bill.",
	            "Accept Employee Salary and Experience, and Calculate Bonus.",
	            "Accept Student Marks and Attendance, Check Exam Eligibility.",
	            "Check if 3 Numbers can be Sides of a Right-Angled Triangle.",
	            "Accept Date (dd, mm, yyyy) and Validate the Date.",
	            "Accept Two Times and Find Which One is Earlier.",
	            "Accept Product Price and Apply Discount Based on Quantity.",
	            "Accept Score of Cricket Player and Classify as Duck, Half-Century, Century.",
	            "Accept 3 Angles and Determine Triangle Type and Validity.",
	            "Accept Month Number and Print Number of Days.",
	            "Accept a Password and Validate using Rules (length, digits, etc).",
	            
		 };
		
		while(true) {
			System.out.println("\n--- Java If-Else Tasks ---\n");
			
			for(int i=0; i<questions.length; i++) {
				System.out.println((i + 1) + ". " + questions[i]);  // Numbering serial wise (1. 2.)
			}
			System.out.println("0. Exit");
			
		System.out.println("\nEnter Question Number to Run (0 to Exit): ");
		int choice = sc.nextInt();
		
		if (choice==0) {
			System.out.println("Thank You! Program Exited. ");
			break;
		}
		
        if (choice >= 1 && choice <= questions.length) {
            System.out.println("\nQuestion " + choice + ": " + questions[choice - 1]);

		switch (choice) {
		case 1: checkPositiveOrNegative(sc); break;
		case 2: checkEvenOrOdd(); break;
		case 3: checkDivisibleBy5And11(sc); break;
		case 4: checkVowelOrConsonant(sc); break;
		case 5: checkAlphabetOrNot(sc); break;
		case 6: largestOfTwo(sc); break;
		case 7: largestOfThree(sc); break;
		case 8: checkLeapYear(sc); break;
		case 9: checkThreeDigit(sc); break;
		case 10: checkDivisibleBy3And7(sc); break;
		case 11: checkUpperOrLower(sc); break;
		case 12: checkZeroPostiveNegative(sc); break;
		case 13: TriangleValidityCheck(sc); break;
		case 14: GradeFinder(sc); break;
		case 15: RangeCheck(sc); break;
		case 16: DivisibilityCheck(sc); break;
		case 17: VotingEligibility(sc); break;
		case 18: PalindromeCheck(sc); break;
		case 19: TemperatureSuggestion(sc); break;
		case 20: JobEligibility(sc); break;
		case 21: TriangleTypeCheck(sc); break;
		case 22: QuadrantCheck(sc); break;
		case 23: SecondLargest(sc); break;
		case 24: CharTypeCheck(sc); break;
		case 25: GreetingBasedOnTime(sc); break;
		case 26: SimpleCalculator(sc); break;
		case 27: GradeCalculator(sc); break;
		case 28: MarriageEligibility(sc); break;
		case 29: CenturyYearCheck(sc); break;
		case 30: SimpelCal(sc); break;
		case 31: PerfectSquare(sc); break;
		case 32: TriangleType(sc); break;
		case 33: ScholarshipEligibility(sc); break;
		case 34: ArmstrongNumberCheck(sc); break;
		case 35: SumOfDigitsEvenOdd(sc); break;
		case 36: EndsWithFiveCheck(sc); break;
		case 37: MonthToSeason(sc); break;
		case 38: DayNumberToWeekday(sc); break;
		case 39: ElectricityBillPunjab(sc); break;
		case 40: EmployeeBonusCalculator(sc); break;
		case 41: ExamEligibilityChecker(sc); break;
		case 42: RightAngledTriangleChecker(sc); break;
		case 43: ValidateDate(sc); break;
		case 44: compareTimes(sc); break;
		case 45: applyDiscount(sc); break;
		case 46: cricketScoreClassify(sc); break;
		case 47: triangleByAngles(sc); break;
		case 48: daysInMonth(sc); break;
		case 49: validatePassword(sc); break;
		
		default: System.out.println("Solution not added yet.");
		}
        }else {
			System.out.println("Invalid Choice. Please Enter a Number Between 1 and "+ questions.length);
		}
	}
		sc.close();
}

	
	// ===================== METHOD IMPLEMENTATIONS =====================
	
	static void checkPositiveOrNegative(Scanner sc) {
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("The Number " + num + " is Positive");
        else if (num < 0)
            System.out.println("The Number " + num + " is Negative");
        else
            System.out.println("The Number " + num + " is Zero");
	}
	
	static void checkEvenOrOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("The Number " + num + " is Even");
        else
            System.out.println("The Number " + num + " is Odd");
    }
	
	static void checkDivisibleBy5And11(Scanner sc) {
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		
		if (num % 5 == 0 || num % 11 == 0 ) {
			
            System.out.println("Divisible by both 5 and 11");
		}else {
            System.out.println("Not Divisible by both 5 and 11");
		}	
	}
	
	static void checkVowelOrConsonant(Scanner sc) {
		System.out.println("Enter a Character:");
		char ch = sc.next().toLowerCase().charAt(0);
		
		if (Character.isLetter(ch)) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
				System.out.println("The Character is Vowel");
			else 
				System.out.println("The Character is Consonant");
			}else {
				System.out.println("The Character is (Not an alphabet).");
				
			}	
		}
	
	static void checkAlphabetOrNot(Scanner sc) {
		System.out.println("Enter a Character:");
		char ch = sc.next().toLowerCase().charAt(0);
		
		if ((ch >= 'a' && ch <= 'z' ) && (ch >= 'A' && ch <= 'Z' )) {
			System.out.println("The Character is Alphabet");
		}else {
			System.out.println("The Character is Not an Alphabet");
		}
	}
	
	static void largestOfTwo(Scanner sc) {
		System.out.println("Enter The First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter The Second Number: ");
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println(a +" -> is larger:");
		}else if(b > a) {
			System.out.println(b + " -> is larger:");
		}else {
			System.out.println("Both Are Equal");
		}
	}
	
	static void largestOfThree(Scanner sc ) {
		System.out.println("Enter The First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter The Second Number: ");
		int b = sc.nextInt();
		System.out.println("Enter The Third Number: ");
		int c = sc.nextInt();
		
		if (a >= b && a >= c) {
			System.out.println(a +" -> is largest:");
		}else if(b >= a && b >= c) {
			System.out.println(b + " -> is largest:");
		}else {
			System.out.println(c +" -> is largest:");
		}
	}
	
	static void checkLeapYear(Scanner sc ) {
		System.out.println("Enter The Year: ");
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 )) {
			System.out.println(year + " -> Is a Leap Year");
		}else {
			System.out.println(year + " -> Is Not a Leap Year");
		}
	}
	
	
	static void checkThreeDigit(Scanner sc ) {
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		
		if (num >= 100 && num <= 999) {
			System.out.println(num + " -> It's a 3-Digit Number");
		}else {
			System.out.println(num + " -> Not a 3-Digit Number");
		}
	}
	
	static void checkDivisibleBy3And7(Scanner sc ) {
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		
		if (num % 3 == 0 && num % 7 == 0) {
			System.out.println("Divisible by both 3 and 7");
		}else {
			System.out.println("Not Divisible by both 3 and 7");
		}
	}
	
	static void checkUpperOrLower(Scanner sc) {
		System.out.println("Enter a Character ");
		char ch = sc.next().charAt(0);
		
		if (Character.isUpperCase(ch)) {
			System.out.println(ch + " -> The character is Uppercase.");
		}else if (Character.isLowerCase(ch)) {
			System.out.println(ch + " -> The character is  Lowercase.");
		}else {
			System.out.println("The Character is Not An Alphabet");
		}
	}
	
	static void checkZeroPostiveNegative(Scanner sc) {
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println(num + " -> Number is Postive: ");
		}else if (num <= 0){
			System.out.println(num + " -> Number is Negative: ");
		}else {
			System.out.println("Number is Zero: ");
		}
	}
	
	static void TriangleValidityCheck(Scanner sc ) {
		System.out.println("Enter the Angle1");
		int angle1 = sc.nextInt();
		System.out.println("Enter the Angle2");
		int angle2 = sc.nextInt();
		System.out.println("Enter the Angle3");
		int angle3 = sc.nextInt();
		
		int sum = angle1+angle2+angle3;
		
		if (sum == 180 && angle1 >= 0 && angle2 >= 0 && angle3 >= 0) {
			System.out.println("The Triangle Is Valid.");			
		}else {
			System.out.println("The Triangle Is  Not Valid.");	
		}
	}
	
	static void GradeFinder(Scanner sc) {
		System.out.println("Enter Marks (0–100): ");
		int num = sc.nextInt();
		
		if (num <= 0 && num >= 100) {
			System.out.println("Invalid marks!");
		}else if (num >= 90) {
			System.out.println("Grade: A+");
		}else if (num >= 80) {
			System.out.println("Grade: A");
		}else if (num >= 70) {
			System.out.println("Grade: B");
		}else if (num >= 60) {
			System.out.println("Grade: C");
		}else if (num >= 50) {
			System.out.println("Grade: D");
		}else {
			System.out.println("Grade: F (Fail)");
		}
	}
	
	static void RangeCheck(Scanner sc) {
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		
		if (num >= 10 && num <= 100 ) {
			System.out.println("The Number Is Within The Range (10-100).");
		}else {
			System.out.println("The Number Is Outside The Range (10-100).");
		}
	}
	
	static void DivisibilityCheck(Scanner sc) {
		System.out.println("Enter The Number:");
		int num = sc.nextInt();
		
		if (num % 2 == 0 || num % 3 == 0) {
			 System.out.println("The number is divisible by (2 or 3).");
		}else {
			 System.out.println("The number is NOT divisible by (2 or 3).");
		}
	}
	
	static void VotingEligibility(Scanner sc ) {
		
		System.out.println("Enter The Age ");
		int num = sc.nextInt();
		
		if (num >= 18 ) {
			System.out.println("You Are Eligible To Vote.");
		}else {
			System.out.println("You Are NOT Eligible To Vote.");
		}
	}
	
	static void PalindromeCheck(Scanner sc ) {
		
		System.out.println("Enter The Number ");
		int num = sc.nextInt();
	
		int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
	}

	static void TemperatureSuggestion(Scanner sc ) {
		
		System.out.println("Enter temperature (°C): ");
		int temp = sc.nextInt();
		
	  if (temp < 10) {
		 System.out.println("It's cold! Wear a heavy jacket.");
    } else if (temp <= 20) {
        System.out.println("Cool weather. Wear a sweater.");
    } else if (temp <= 30) {
        System.out.println("Mild weather. Wear light clothes.");
    } else {
        System.out.println("It's hot! Wear shorts and a t-shirt.");
    }	
  }
	
	static void JobEligibility(Scanner sc) {
		System.out.println("Enter The Age ");
		int num = sc.nextInt();
		
		if(num >= 18 && num <= 35) {
		 System.out.println("Eligible for the job.");
    } else {
        System.out.println("Not eligible for the job.");
    }
 }
	
	static void TriangleTypeCheck(Scanner sc) {
		 System.out.println("Enter The side A:");
		 int a = sc.nextInt();
		 System.out.println("Enter The side B:");
		 int b = sc.nextInt();
		 System.out.println("Enter The side C:");
		 int c = sc.nextInt();
		 
		 if(a + b > c && b + c > a && a + c > b) {
		 if (a == b && b == c) {
			 System.out.println("Equilateral Triangle");
			 
		 }else if (a == b || b == c || a == c) {
			 System.out.println("Isosceles Triangle");
		 }else {
			 System.out.println("Scalene Triangle");
		 }			 
	}
}
	
	static void QuadrantCheck(Scanner sc) {
		System.out.println("Enter the X Coordinate");
			int x = sc.nextInt();
			
		System.out.println("Enter the Y Coordinate");
			int y = sc.nextInt();
			
			if (x >= 0 && y >= 0 ) {
				 System.out.println("First Quadrant");
			}else if (x >= 0 && y <= 0) {
				 System.out.println("Second Quadrant");
			}else if (x <= 0 && y <= 0) {
				System.out.println("Third Quadrant");
			}else if (x >= 0 && y <= 0) {
				System.out.println("Fourth Quadrant");
				
			}else if (x == 0 && y == 0) {
	            System.out.println("Origin");
	        } else if (x == 0) {
	            System.out.println("On Y-axis");
	        } else {
	            System.out.println("On X-axis");
	        }
		}
	static void SecondLargest(Scanner sc ){
		System.out.println("Enter the First Number:");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int b = sc.nextInt();
		System.out.println("Enter the Third Number:");
		int c = sc.nextInt();
		
		int second;
		
		if((a >= b && a <= c ) ||(a >= c && a <= b)) {
			second = a;
		}else if((b >= a && b <= c)|| (b >= c && b <= a )) {
			second = b;
		}else {
			second = c;
		}
		System.out.println("Second largest number is: " + second);	
	}
	
	
	static void CharTypeCheck(Scanner sc) {
		System.out.println("Enter The Character");
		char ch = sc.next().charAt(0);
		
		if(Character.isDigit(ch)) {
			System.out.println("it's is a Digit");
		}else if(Character.isLetter(ch)) {
			System.out.println("it's  is a Latter.");
		}else {
			System.out.println("It is a Special Character.");
		}
	}
	
	static void GreetingBasedOnTime(Scanner sc) {
		System.out.println("Enter The Hour (0-23): ");
		int hour = sc.nextInt();
		
		if (hour >= 0 && hour < 12) {
            System.out.println("Good Morning!");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Good Afternoon!");
        } else if (hour >= 17 && hour <= 23) {
            System.out.println("Good Evening!");
        } else {
            System.out.println("Invalid Time");
        }
	}
	
	static void SimpleCalculator(Scanner sc) {
		System.out.println("Enter The First Number: ");
		double numa = sc.nextDouble();
		
		System.out.println("Enter The Operator (+, -, *, /): ");
		char op = sc.next().charAt(0);
		
		System.out.println("Enter The Second Number: ");
		double numb = sc.nextDouble();
		
		if(op == '+') {
			System.out.println("Result:-  " + (numa + numb));
		}else if (op == '-'){
			System.out.println("Result:-  " + (numa - numb));
		}else if (op == '*') {
			System.out.println("Result:-  " + (numa * numb));
		}else if (op == '/') {
			if (numb != 0)
			System.out.println("Result:-  " + (numa / numb));
			else
				System.out.println("Cannot divide by zero!");
		}else {
			 System.out.println("Invalid operator.");
		}
	}
	
	static void GradeCalculator(Scanner sc ) {
		
		int total = 0, marks;
		boolean pass = true;
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Enter The Marks For Subject" + i +": ");
			marks = sc.nextInt();
			total += marks;
			if (marks <= 35) pass = false;
		}
		double avg = total/5.8;
		
		System.out.println("Average: "+ avg);
		if (!pass) {
			System.out.println("Result: FAIL");
		}else {
			if(avg >= 90) {
				System.out.println("Grade: A+");
			}else if(avg >= 80) {
				System.out.println("Grade: A");
			}else if(avg >= 70) {
				System.out.println("Grade: B");
			}else if(avg >= 60) {
				System.out.println("Grade: c");
			}else {
				System.out.println("Grade: D");
			}
		}
	}
	
	static void MarriageEligibility(Scanner sc ) {
		System.out.println("Enter the Gender(M/F)");
		char gender = sc.next().charAt(0);
		
		System.out.println("Enter The Age: ");
		int age = sc.nextInt();
		
		if ((gender == 'M' && age >= 21) || (gender == 'F' && age >= 18)) {
			System.out.println("Eligible To Marriage: ");
		}else {
			System.out.println(" NOT Eligible To Marriage: ");
		}
	}
	
  static void CenturyYearCheck(Scanner sc ) {	
	System.out.println("Enter The Year: ");
	char year = sc.next().charAt(0);
	
	if (year % 100  == 0) {
		System.out.println(year + " :- is a Century Year.");
	}else {
		System.out.println(year + " :- NOT is a Century Year.");
	}
  }
  
  static void SimpelCal(Scanner sc) {
	  System.out.println("Enter The Number: ");
	  int a = sc.nextInt();
	  System.out.println("Enter the Operater (+, -, *, /): ");
	  char op = sc.next().charAt(0);
	  System.out.println("Enter The Number: ");
	  int b = sc.nextInt();
	  
	  if(op == '+') {
		  System.out.println("result: " + (a + b));
	  }else if(op == '-') {
		  System.out.println("result: " + (a - b));
	  }else if(op == '*') {
		  System.out.println("result: " + (a * b));
	  }else if(op == '/') {
		  if (b != 0) 
			  System.out.println("result: " + (a / b));
		  else 
			  System.out.println("Cannot divide by zero!");
	  }else {
		  System.out.println("Invalid operator.");
	  } 
  }
  
  static void PerfectSquare(Scanner sc) {
	  System.out.println("Enter the Number: ");
	  int num = sc.nextInt();
	  
	  if (num <= 0) {
		  System.out.println(num + " is NOT a Perfect Square (Negative Number Cannot be Perfect Square).");
	  }else {
		  int sqrt = (int)Math.sqrt(num);
		  if (sqrt * sqrt == num) {
			  System.out.println(num + (":- is a Perfect Square. "));
		  }else {
			  System.out.println(num + (":- NOT is a Perfect Square. "));
		  }
	  }
  }
  
  
	 
	  /*Equilateral (all sides equal)
	  	Isosceles (two sides equal)
	  	Scalene (all sides different)*/
      static void TriangleType(Scanner sc ) {
	  System.out.println("Enter The First Side. ");
	  int a = sc.nextInt();
	  System.out.println("Enter The Second Side. ");
	  int b = sc.nextInt();
	  System.out.println("Enter The Third Side. ");
	  int c = sc.nextInt();
	  
	  if(a + b > c && b + c > a && a + c > b) {
		  if (a == b && b == c) {
			  System.out.println("The triangle is Equilateral.");
		  }else if (a == b || b == c || a == c){
			  System.out.println("The triangle is Scalene.");
		  }else {
			  System.out.println("The given sides do not form a valid triangle.");
			  
		  }
	  }
  }
      
      static void ScholarshipEligibility (Scanner sc) {
    	  
    	  System.out.println("Enter The Name of Student: ");
    	  char name = sc.next().charAt(0);
    	  
    	  System.out.println("Enter Student's Percentage Marks ");
    	  double marks = sc.nextDouble();
    	  
    	  System.out.println("Enter Family's Annual Income (in Rs).");
    	  double income = sc.nextDouble();
    	  
    	  if (marks >= 85 && income <= 250000) {
    		  System.out.println(name + " is Eligible For Scholarship.");
    	  }else {
    		  System.out.println(name + " is NOT Eligible For Scholarship.");
    	  }
      }
      
      static void ArmstrongNumberCheck (Scanner sc ) {
    	  
    	  System.out.println("Enter The Number: ");
    	  int number = sc.nextInt();
    	  
    	  int originalNumber = number;
    	  int result = 0;
    	   
    	  int count = 0;			//Count number of digits
    	  int temp = number;
    	  while (temp != 0) {
    		  count ++;
    		  temp /= 10;
    	  }
    	  
    	  temp = number;			// Calculate sum of digits raised to the power of count
    	  while (temp != 0) {
    		  int digit  = temp % 10;
    		  result += Math.pow(digit, count);
              temp /= 10;
    	  }
    	  							// Check if it's an Armstrong number
          if (result == originalNumber) {
              System.out.println(originalNumber + " is an Armstrong number.");
          } else {
              System.out.println(originalNumber + " is NOT an Armstrong number.");
          }  
      }
	
      static void SumOfDigitsEvenOdd(Scanner sc) {
    	  System.out.println("Enter The Number: ");
    	  int num = sc.nextInt();
    	  
    	  int sum = 0;
          int temp = Math.abs(num); // Handle negative numbers

          						  // Calculate sum of digits
          while (temp > 0) {
              sum += temp % 10;
              temp /= 10;
          }
          
          if(sum % 2 == 0) {
        	  System.out.println("Sum of Digits(" + sum + "(is EVEN.");
          }else {
        	  System.out.println("Sum of Digits(" + sum + "(is ODD.");
          }
      }
      
      static void EndsWithFiveCheck (Scanner sc) {
    	  System.out.println("Enter The Number: ");
    	  int num = sc.nextInt();
    	  
    	  if (Math.abs(num) % 10 == 5) {
    		  System.out.println(num +" :- End With 5.");
    	  }else {
    		  System.out.println(num + " :- Dose NOT End With 5.");
    	  }
      }
      
      static void MonthToSeason(Scanner sc) {
    	  System.out.println("Enter The Month Number (1-12):");
    	  int month = sc.nextInt();
    	  
    	  if (month >= 1 && month <= 12) {
    		  if (month == 12 || month == 1 || month == 2) {
    			  System.out.println("Season: Winter");
    		  }else if ((month >= 3 &&month <= 5)) {
    			  System.out.println("Season: Spring");
    		  }else if (month >= 6 && month <= 8) {
    			  System.out.println("Season: Summar");
    		  }else if (month >= 9 && month <= 11) {
    			  System.out.println("Season: Autumn");
    		  }  
    		  }else {
    			  System.out.println("Invalid month number. Please enter a number between (1 and 12).");
    	  }
      }
      
      static void DayNumberToWeekday(Scanner sc) {
    	  System.out.println("Enter The Day Number (1 - 7): ");
    	  int day = sc.nextInt();
    	  
    	  String Weekday;
    	  switch (day) {
    	  case 1:  Weekday = "Sunday";break;
    	  case 2:  Weekday = "Monday";break;
    	  case 3:  Weekday = "Tuesday";break;
    	  case 4:  Weekday = "Wednesday";break;
    	  case 5:  Weekday = "Thrusday";break;
    	  case 6:  Weekday = "Friday";break;
    	  case 7:  Weekday = "Saturday";break;
    	  default: Weekday = null;
    	  }
    	  
    	  if (Weekday != null) {
    		  System.out.println("Day"+ day + " is" + Weekday);
    	  }else {
    		  System.out.println("Invalid day number. Please enter a number between (1 and 7).");
    	  }
      }
      
      static void ElectricityBillPunjab(Scanner sc ) {
    	  System.out.println("Enter The Consumer Name");
    	  sc.nextLine();
    	  String name = sc.nextLine();
    	  
    	  System.out.println("Consumer Address");
    	  String address = sc.nextLine();
    	  
    	  System.out.println("Electricity Units Consumed");
    	  int units = sc.nextInt();
    	  
    	  double bill = 0;
    	  
    	  if (units <= 100) {		 // Rs. 3.75 per unit   // Next 200 units at Rs. 5.20  // Next 200 units at Rs. 6.50   // Next units at Rs. 7.10
    		  bill = units * 3.75;
    	  }else if (units <= 300) {
    		  bill = 100 * 3.75 + (units - 100) * 5.20;
    	  }else if (units <= 500) {
    		  bill = 100 * 3.75 + 200 * 5.20 + (units - 300) * 6.50;
    	  }else {
    		  bill = 100 * 3.75 + 200 * 5.20 + 200 * 6.50 + (units - 500) * 7.10;
    	  }
    	  
    	  double fixedCharge = 50; 		// Rs. 50 as fixed meter rent
    	  bill += fixedCharge;
    	  
    	  if (bill > 500 ) {
    		  double surcharge = bill * 0.15;
    		  bill += surcharge;
    		  
    		  //output bill detils...
    		  
    		  System.out.println("\n =====(PUNJAB LUDHIANA)===== ");
    		  System.out.println(" Electricity Bill Details:- ");
    		  System.out.println("Consumer Name     :  " + name);
    		  System.out.println("Consumer Address  :  " + address);
    		  System.out.println("Units Consumed    :  " + units );
    		  System.out.println("Base Bill         : Rs. " + String.format("%.2f", bill - fixedCharge - surcharge));
    		  System.out.println("Fixed Meter Rent  : Rs. " + fixedCharge);
    		  System.out.println("Surcharge (if any): Rs. " + String.format("%.2f", surcharge));
    		  System.out.println("Total BILL Amount : Rs. " + String.format("%.2f", bill));  
    	  }
    	  
    	  System.out.println("\n=====Thank you=====");
      }
      
      static void EmployeeBonusCalculator (Scanner sc ) {
    	  System.out.println("Enter Employee Salary:");
    	  int salary = sc.nextInt();
    	  
    	  System.out.println("Enter Employee Experience in years:");
    	  int experience = sc.nextInt();
    	  
    	  double bonus;
    	  
    	  if (experience >= 10) {
    		  bonus = salary * 0.20;  // 20% bonus
    	  }else if (experience >= 5) {
    		  bonus = salary * 0.10;  // 10% bonus
    	  }else if (experience >= 2) {
    		  bonus = salary * 0.05;  // 5% bonus
    	  }else {
    		  bonus = 0;
    	  }
    	  
    	  //output the result:
    	  
    	  System.out.println("Employee Salary: " + salary);
    	  System.out.println("Employee Experience in years: " + experience);
    	  System.out.println("Calculated Bonus: "+ bonus);
      }
      
      static void ExamEligibilityChecker(Scanner sc) {
    	  System.out.println("Enter the Student Marks (out of 100).");
    	  int marks = sc.nextInt();
    	  
    	  System.out.println("Enter Attendance Percentage: ");
    	  int attendance = sc.nextInt();
    	  
    	  if (marks >= 35 && attendance >= 75) {
    		  System.out.println("✅ Student is eligible to appear in the exam.");
    	  }else {
    		  System.out.println("❌ Student is NOT eligible to appear in the exam."); 
    	  }
    	  if (marks < 35) {
    		  System.out.println("Reason: Marks is less than 35.");
    	  }
    	  if (attendance < 75 ) {
    		  System.out.println("Reson: Attendance is less than 75%.");
    	  }	  
      }
      
      static void RightAngledTriangleChecker(Scanner sc) {
    	  System.out.println("Enter The First Side: ");
    	  int a = sc.nextInt();
    	  
    	  System.out.println("Enter The Second Side: ");
    	  int b = sc.nextInt();
    	  
    	  System.out.println("Enter The Third Side: ");
    	  int c = sc.nextInt();
    	  
    	  if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b)){  //  ABC  BCA  ACB
    		  System.out.println(" These sides CAN form a right-angled triangle.");
    	  }else {
    		  System.out.println("These sides CANNOT form a right-angled triangle.");
    	  } 
      }
      
      static void ValidateDate(Scanner sc) {
    	  System.out.println("ENter the Day: ");
    	  int day = sc.nextInt();
    	  
    	  System.out.println("Enter the Month: ");
    	  int month = sc.nextInt();
    	  
    	  System.out.println("Enter the Year: ");
    	  int year = sc.nextInt();
    	   
    	  boolean leap = (year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0); 
    	  int daysInMonth;
    	  
    	  if (month < 1 || month > 12 ) {
    		  System.out.println(" Invalid Month: ");
    		  return ;
    	  }
    	  
    	  switch (month) {
          case 2:
              daysInMonth = (leap) ? 29 : 28;
              break;
          case 4: case 6: case 9: case 11:
              daysInMonth = 30;
              break;
          default:
              daysInMonth = 31;
      }
    	  if (day >= 1 && day <= daysInMonth) {
    	        System.out.println("Valid Date");
    	    } else {
    	        System.out.println("Invalid Date");
    	    }
    	}
      
      static void compareTimes(Scanner sc) {
    	    System.out.print("Enter first time (hh mm): ");
    	    int h1 = sc.nextInt(), m1 = sc.nextInt();
    	    System.out.print("Enter second time (hh mm): ");
    	    int h2 = sc.nextInt(), m2 = sc.nextInt();

    	    if (h1 < h2 || (h1 == h2 && m1 < m2)) {
    	        System.out.println("First time is earlier");
    	    } else if (h1 == h2 && m1 == m2) {
    	        System.out.println("Both times are equal");
    	    } else {
    	        System.out.println("Second time is earlier");
    	    }
    	}
      
      
      static void applyDiscount(Scanner sc) {
    	    System.out.print("Enter product price: ");
    	    double price = sc.nextDouble();
    	    System.out.print("Enter quantity: ");
    	    int qty = sc.nextInt();

    	    double total = price * qty;
    	    double discount = 0;

    	    if (qty >= 10 && qty < 20) discount = 0.05;
    	    else if (qty >= 20 && qty < 50) discount = 0.10;
    	    else if (qty >= 50) discount = 0.15;

    	    double finalAmount = total - (total * discount);
    	    System.out.println("Total after discount: ₹" + finalAmount);
    	}
      
      static void cricketScoreClassify(Scanner sc) {
    	    System.out.print("Enter player score: ");
    	    int score = sc.nextInt();

    	    if (score == 0) {
    	        System.out.println("Duck 🦆");
    	    } else if (score > 0 && score < 50) {
    	        System.out.println("Needs Improvement");
    	    } else if (score >= 50 && score < 100) {
    	        System.out.println("Half-Century 🔥");
    	    } else if (score >= 100) {
    	        System.out.println("Century 💯");
    	    }
    	}

      
      static void triangleByAngles(Scanner sc) {
    	    System.out.print("Enter 3 angles: ");
    	    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

    	    if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
    	        System.out.println("Valid Triangle");
    	        if (a == b && b == c)
    	            System.out.println("Equilateral Triangle");
    	        else if (a == b || b == c || a == c)
    	            System.out.println("Isosceles Triangle");
    	        else
    	            System.out.println("Scalene Triangle");
    	    } else {
    	        System.out.println("Invalid Triangle");
    	    }
    	}
      
      static void daysInMonth(Scanner sc) {
    	    System.out.print("Enter month number (1-12): ");
    	    int month = sc.nextInt();

    	    switch (month) {
    	        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
    	            System.out.println("31 days");
    	            break;
    	        case 4: case 6: case 9: case 11:
    	            System.out.println("30 days");
    	            break;
    	        case 2:
    	            System.out.println("28 or 29 days (Leap Year check needed)");
    	            break;
    	        default:
    	            System.out.println("Invalid month");
    	    }
    	}
      
      static void validatePassword(Scanner sc) {
    	    System.out.print("Enter password: ");
    	    String password = sc.next();

    	    boolean length = password.length() >= 8;
    	    boolean upper = password.matches(".*[A-Z].*");
    	    boolean lower = password.matches(".*[a-z].*");
    	    boolean digit = password.matches(".*\\d.*");
    	    boolean special = password.matches(".*[!@#$%^&*()].*");

    	    if (length && upper && lower && digit && special) {
    	        System.out.println("Strong password ✅");
    	    } else {
    	        System.out.println("Weak password ❌");
    	    }
      }	
}
	



