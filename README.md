# 미션 - 숫자 야구 게임

## 기능 구현 목록
### 컴퓨터
- 1에서 9까지 서로 다른 임의의 수 3개를 생성
    - [예외처리] 중복되는 숫자가 있으면 안 됨
    - [예외처리] 1 ~ 9의 숫자로만 이루어져야 함
    - [예외처리] 임의의 수는 딱 3개만 생성되어야 함

### 게임
- 3자리 수 입력받기 -> 입력 값과 컴퓨터의 임의의 수 3자리 값과 비교 -> 힌트 출력
    - 같은 자리에 같은 숫자가 있는 경우를 스트라이크, 다른 자리에 숫자가 있는 경우를 볼로 정해서 출력
    - 같은 숫자가 하나도 없는 경우 -> '낫싱'을 출력
    - [예외처리] 빈 값이면 안 됨
    - [예외처리] 숫자여야 함
    - [예외처리] 숫자에 0이 들어가면 얀 됨 (= 각 자리의 숫자가 1~9로 이루어져야 함)
    - [예외처리] 총 자리 수가 3자리여야 함
    - [예외처리] 중복된 숫자가 존재하면 안 됨
    - [예외처리] 음수이면 안 됨
- 정답일 경우 -> '3개의 숫자를 모두 맞히셨습니다! 게임 종료' 출력
- 3자리 수를 맞출 경우 게임을 다시 시작하거나 완전히 종료할 지에 대해 값 입력받기
    - '게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.'
    - [예외처리] 입력 값으로 1, 2 외의 값을 받으면 안 됨
    - [예외처리] 빈 값이면 안 됨
- 게임 다시 시작하기 기능
- 게임 종료하기 기능 
