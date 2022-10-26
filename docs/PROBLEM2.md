## 🚀 기능 요구 사항

## 📈 기능 목록

문제 2번의 흐름은 [입력된 String을 StringBuilder로 형태를 변경한다] > [StringBuilder를 조작해서 중복을 제거한다] > [제거된 String을 리턴한다] 순으로 이루어진다

1. 입력된 String을 StringBuilder로 형태를 바꾼다
2. StringBuilder를 조작해서 중복을 제거한다
   - StringBuilder의 index를 통해서 순회한다
   - index와 index+1이 같은 경우 StringBuilder의 index,index+1을 각각 제거한다
   - index를 1만큼 감소시킨다(0보다 작아지면 0으로 유지한다)
   - index+1이 전체 길이보다 길어질 때까지 과정 2를 반복한다
3. 제거된 String을 return한다

암호문을 좋아하는 괴짜 개발자 브라운이 이번에는 중복 문자를 이용한 새로운 암호를 만들었다. 예를 들어 "browoanoommnaon"이라는 암호문은 다음과 같은 순서로 해독할 수 있다.

1. "browoanoommnaon"
2. "browoannaon"
3. "browoaaon"
4. "browoon"
5. "brown"

임의의 문자열 cryptogram이 매개변수로 주어질 때, 연속하는 중복 문자들을 삭제한 결과를 return 하도록 solution 메서드를 완성하라.

### 제한사항

- cryptogram은 길이가 1 이상 1000 이하인 문자열이다.
- cryptogram은 알파벳 소문자로만 이루어져 있다.

### 실행 결과 예시

| cryptogram | result |
| --- | --- |
| "browoanoommnaon" | "brown" |
| "zyelleyz" | "" |
