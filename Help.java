class new_Help {
	private int options_num = 7;

	void show_menu(){
			System.out.println("Справка по операторам");
                        System.out.println("1. if");
                        System.out.println("2. switch");
                        System.out.println("3. for");
                        System.out.println("4. while");
                        System.out.println("5. do-while");
                        System.out.println("6. break");
                        System.out.println("7. continue");
			System.out.println('\n');
	}	

	int menu_choose() throws java.io.IOException {
		int ch, ignore;
		do{
			System.out.print("Выберите номер раздела (для выхода 'q'): ");
			ch = (char) System.in.read();
                        ignore = (char) System.in.read();
		}while(((ch<1 | ch > options_num) & (ch != 'q'))&(ignore != '\n'));
		return ch;
	}

	void show_option(int ch){
		switch(ch) {
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
				break;
                }
		System.out.println('\n');
	}
}


class Help{	
        public static void main(String args[]) throws java.io.IOException {
		new_Help menu = new new_Help();
		int choice;
		while(true){
			menu.show_menu();

			choice = menu.menu_choose(); 
			if (choice == 'q') break;	
			menu.show_option(choice);
		}
	}
}
