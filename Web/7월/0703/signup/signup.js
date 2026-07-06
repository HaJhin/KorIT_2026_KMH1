let members = [{id:"text",pw:1234, email : "test@naver.com"}];

// 필요한 html 요소를 전부 읽어온다.
const idInput = document.getElementById("idInput");
const pwInput = document.getElementById("pwInput");
const emailInput = document.getElementById("emailInput");
const emailDomain = document.getElementById("emailDomain");

const checkBtn = document.getElementById("checkBtn");
const joinBtn = document.getElementById("joinBtn");

const notice = document.getElementById("notice");
const userList = document.getElementById("userList");

const isDuplicateId = (id) => {
    for (let members of member){
        if(member.id === id){
            return true;
        }
    }
    return false;
}

// 아이디 중복 검사
// 1. 사용자가 입력한 값을 받아온다.
checkBtn.addEventListener("click", () => {
    let id = idInput.value;
    if (id === '') {
        alert("아이디를 입력하세요.");
        return;
    }
    if (isDuplicateId(id)){
        notice.innerText = "이미 사용중인 아이디입니다.";
        notice.style.color = "red"
    } else {
        notice.innerText = "사용가능한 아이디입니다.";
        notice.style.color = "green"
    }
})

// 회원가입 버튼을 눌렀을 때
joinBtn.addEventListener("click", () => {
    let id = idInput.value;
    let pw = pwInput.value;
    let email = emailInput.value;
    let eDomain = emailDomain.value;

    if(id === '' || pw === '' || email === ''){
        alert('모든 항목을 입력하세요');
        return;
    }
    let email = email + '@' + eDomain;
    let member = {
        id : id,
        pw : pw,
        email : email
    };
    members.push(member);

    idInput.value = '';
    pwInput.value = '';
    emailInput.value = '';

    printMember();
})