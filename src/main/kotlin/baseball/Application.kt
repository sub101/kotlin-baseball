package baseball

fun main() {
    while (true) {
        // 랜덤 정수 생성
        var randomNum: IntArray = IntArray(3)
        randomNum[0] = (Math.random() * 10).toInt()

        do {
            randomNum[1] = (Math.random() * 10).toInt()
        } while (randomNum[1] == randomNum[0])

        do {
            randomNum[2] = (Math.random() * 10).toInt()
        } while (randomNum[2] == randomNum[0] || randomNum[2] == randomNum[1])

        for (i in 0..2){
            print(randomNum[i])
        }

        println()

        var strike: Int = 0
        var ball: Int

        while (strike != 3) {
            strike = 0
            ball = 0

            println("숫자를 입력해주세요 : ")
            var input = readLine()!!.toInt()
            var inputNum: IntArray = IntArray(3)

            // 입력값 각 자리수 값 입력
            inputNum[0] = input / 100
            input = input - (inputNum[0] * 100)

            inputNum[1] = input / 10
            input = input - (inputNum[1] * 10)

            inputNum[2] = input

            for (i in 0..2){
                println(inputNum[i])
            }

            // 값 비교
            for (i in 0..2) {
                for (r in 0..2) {
                    if (inputNum[i] == randomNum[r]){
                        if (i == r) {
                            strike++
                        }
                        else {
                            ball++
                        }
                        break
                    }
                }
            }

            // 출력
            if (strike == 0 && ball == 0) {
                println("낫싱")
            } else if (strike == 0) {
                print("${ball}볼")
            } else if (ball == 0) {
                println("${strike}스트라이크")
            } else {
                println("${ball}볼 ${strike}스트라이크")
            }
            println()
        }

        // 종료 메세지
        println("3개의 숫자를 모두 맞히셨습니다! 게임종료")
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        var closeOrNot = readLine()!!.toInt()
        if (closeOrNot == 1) {
            continue
        } else if (closeOrNot == 2) {
            break
        } else {
            // 잘못입력 처리
        }
    }
}


