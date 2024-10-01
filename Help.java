class Help {
        public static void main(String args[]) throws java.io.IOException {
                char choice, ignore;
		do{
                	System.out.println("Справка по операторам");
                	System.out.println("1. if");
                	System.out.println("2. switch");
			System.out.println("3. for");
			System.out.println("4. while");
			System.out.println("5. do-while");
			System.out.println("6. break");
			System.out.println("7. continue");
			System.out.println("Выберите номер раздела (для выхода 'q'): ");

                	choice = (char) System.in.read();
			do{
				ignore = (char)System.in.read();
			}while(ignore!='\n');
		

                System.out.println("\n");
                switch(choice) {
                        case '1' :
                                System.out.println("опертатор if\n");
                                System.out.println("if (условие) {\n\tоператор\n}");
                                System.out.println("[else {\n\tоператор\n}]");
                                break;
                        case '2':
                                System.out.println("Оператор switch\n");
                                System.out.println("switch (выражение) {");
                                System.out.println("\tcase константа: ");
                                System.out.println("\tпоследовательность операторов");
                                System.out.println("\tbreak;");
                                System.out.println("\t. . . ");
                                System.out.println("} ");
                                break;
			case '3':
                                System.out.println("Оператор цикла for\n");
                                System.out.println("for ([инициализация];[выражение];[конец иттерации]) {");
                                System.out.println("\t[тело цикла]");
                                System.out.println("} ");
                                break;
			case '4':
                                System.out.println("Оператор цикла while\n");
                                System.out.println("while ([выражение]) {");
                                System.out.println("\t[тело цикла]");
                                System.out.println("} ");
                                break;
			case '5':
                                System.out.println("Оператор цикла do-while\n");
                                System.out.println("do {");
                                System.out.println("\t[тело цикла]");
                                System.out.println("}while([выражение]);");
                                break;
				
			case '6':
                                System.out.println("Оператор break\n");
                                System.out.println("\tbreak [имя метки];\n");
                                break;
			
			case '7':
                                System.out.println("Оператор continue\n");
                                System.out.println("\tcontinue [имя метки];\n");
                                break;

                        default:
                                System.out.println("Неверный выбор раздела");
		}
		}while((choice<'1'|choice>'7')&(choice!='q'));

	}
}
