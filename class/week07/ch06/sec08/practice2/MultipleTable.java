package week07.ch06.sec08.practice2;

public class MultipleTable {
	//필드선언
	int dan = 2;
	
	 MultipleTable() {
        ShowMultipleTable(dan);
    }

    MultipleTable(int dan) {
        this.dan = dan;
        ShowMultipleTable(this.dan);
    }

    public void ShowMultipleTable() {
        ShowMultipleTable(this.dan);
    }

    public void ShowMultipleTable(int dan) {
        System.out.println(dan + "단");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d X %d = %d\n", dan, i, dan * i);
        }
    }
}

	//MultipleTable(){}
	//MultipleTable(int dan){
	//this.dan = dan;
	//ShowMultipleTable(this.dan);
	//System.out.println(dan +"dan");
	//for(int i = 1; i < 10; i++) {
		//System.out.printf("%d X %d = %d\n", dan, i, dan*i);
//} 
	//public void ShowMultipleTable(int dan) 
	//{
		//System.out.println(dan +"dan");
		//for(int i = 1; i < 10; i++) {
			//System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		//}
	//}

//}
