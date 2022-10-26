## 🚀 기능 요구 사항

## 📈 기능 목록

문제 2번의 흐름은 [입력된 String을 Descryption 인스턴스를 생성한다] > [decryption 을 통해서 중복을 제거한다] > [descryption을 toString으로 반환한다] 순으로 이루어진다

1. 입력된 String으로 Descryption의 인스턴스를 생성한다
2. descryption으로 중복을 제거한다
   - descryption에서 isRemained함수로 추가로 탐색할 부분이 있는지 검사
   - 있다면 그 부분을 제거할 수 있는지 isDeletable로 체크
   - 삭제할 필요가 없다면 다음 searchNext로 다음 것으로 넘어간다
   - 삭제할 필요가 있다면 delete함수를 호출해서 제거한다
   - 2번 과정을 반복한다
3. 제거된 descryption에서 toString을 return한다

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
