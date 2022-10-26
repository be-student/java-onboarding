## 🚀 기능 요구 사항

## 📈 기능 목록

문제 4번의 흐름은 [입력된 String을 ReverseWord 인스턴스를 생성한다] > [reverseWord 을 통해서 변환한다] > [reverseWord toString으로 반환한다] 순으로 이루어진다

1. 입력된 String으로 ReverseWord 인스턴스를 생성한다
2. reverseWord를 통해 변환한다
   - reverseWord에서 isRemained함수로 추가로 탐색할 부분이 있는지 검사
   - 있다면 그 부분이 알파벳인지 체크
   - 맞다면 변환한다
   - searchNext로 다음 글자로 넘어간다
3. reverseWord를 toString으로 반환한다

어느 연못에 엄마 말씀을 좀처럼 듣지 않는 청개구리가 살고 있었다. 청개구리는 엄마가 하는 말은 무엇이든 반대로 말하였다.

엄마 말씀 word가 매개변수로 주어질 때, 아래 청개구리 사전을 참고해 반대로 변환하여 return 하도록 solution 메서드를 완성하라.

| A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| Z | Y | X | W | V | U | T | S | R | Q | P | O | N | M | L | K | J | I | H | G | F | E | D | C | B | A |

### 제한사항

- word는 길이가 1 이상 1,000 이하인 문자열이다.
- 알파벳 외의 문자는 변환하지 않는다.
- 알파벳 대문자는 알파벳 대문자로, 알파벳 소문자는 알파벳 소문자로 변환한다.

### 실행 결과 예시

| word | result |
| --- | --- |
| "I love you" | "R olev blf" |
