//hasNextInt는 Scanner에서 정수를 입력받은 경우 true를 정수를 입력받지 않는 경우 false의 값을 반환받는 메소드이다.


1. if문을 사용해서 아래와 같이 sc가 정수로 넘어오는지 확인한 후 정수가 아니면 "거짓" 값을 출력을 해준다. 
// Scanner 변수 선언
Scanner sc = new Scanner(System.in);
		
// if문을 사용해서 정수인 경우 true이므로 참을 출력 아닌 경우 false를 출력
if(sc.hasNextInt())
{
	System.out.println("참");
}
else 
{
	System.out.println("거짓");			
}

--------------------------------------------------
  
  2. 두 번째 방식은 while문에서 사용한 응용 방식. while문에 조건을 걸어서 Scanner가 정수로 넘어오지 않는 경우 while문을 끝을 낸다.
  
  Scanner sc = new Scanner(System.in);
		
while(sc.hasNextInt())
{
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println(a + b);
}
