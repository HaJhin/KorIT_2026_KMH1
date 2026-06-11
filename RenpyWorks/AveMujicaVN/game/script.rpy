image umiri normal = Transform("images/umiri normal.jpg", size=(600, 1000))


# 게임에서 사용할 캐릭터를 정의합니다.
define e = Character('아리스')
define s = Character('선생')
define u = Character('야하타 우미리', image="umiri")


# 여기에서부터 게임이 시작합니다.
label start:

    "게임 개발부의 부실에 불이 켜진다."

    e "선생님! 렌파이로 만드는 첫번째 비주얼노벨 게임이네요!."

    s "좋아, 오류는 없는 것 같아."

    show umiri normal at center : 
        ypos 0.8

    u "잠시만요. 저를 잊으면 안돼죠."
    return
