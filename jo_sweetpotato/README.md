2학년 객체지향 수업에 던졌었던 과제3 Pizza store… 다시 도저언..!

- 기능을 구현하기 전에 README.md      파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.

자바 코드 컨벤션을 지키면서 프로그래밍 한다.



피자가게 시스템을 만들어보자.

필수 기능

- 피자에 토핑을 추가할 수 있다. (베이컨, 페페로니, 치즈 ...)
- 토핑이 추가된 피자의 가격과 조리시간, 메뉴정보를 알 수 있다.
- 피자가 오븐에 들어가서 조리가 완료되면 알림이 울린다. (Timer() 사용)



Exception in thread "Timer-0" java.util.ConcurrentModificationException

에러가 발생한다. removeObserver() 에서 발생하는거 같은데 정확한 해결책을 모르겠다. 

```java
public void addPizza(PizzaOrTopping pizza){
    ...
	Timer pizzaTimer = new Timer();
    ...
    pizzaTimer.schedule(new TimerTask() {
        @Override
        public void run() {
            pizza.setFinished();
            finishedPizza = pizza;
            removePizza(pizza);
            notifyObserver();      
        }
    },pizza.getCookingTime());
}
```

