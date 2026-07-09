// 요소 추출
const githubId = document.getElementById("githubId");
const searchBtn = document.getElementById("searchBtn");
const message = document.getElementById("message");
const profileBox = document.getElementById("profileBox");

// 아이디 검증 함수
const validateGitHubId = () => {
    // 아이디 값을 가져온다.
    const value = githubId.value.trim();

    let regex = /^[A-Za-z0-9-]+$/;

    if (value === "") { // 입력 여부 검사
        message.textContent = "GitHub 아이디를 입력하세요";
        searchBtn.disabled = true;
        return false;
    }
    if (value.length < 3 || value.length > 20) { // 길이 검사
        message.textContent = "아이디는 3자 이상 20자 이하로 입력하세요.";
        searchBtn.disabled = true;
        return false;
    }
    if (!regex.test(value)) { // 정규식 검사
        message.textContent = "아이디는 영어, 숫자 하이픈만 입력하세요.";
        searchBtn.disabled = true;
        return false;
    }
    if (value.startsWith("-") || value.endsWith("-")) { // 하이픈이 맨앞이나 뒤에 오는지 검사
        message.textContent = "하이픈은 시작과 끝에 사용할 수 없습니다."
        searchBtn.disabled = true;
        return false;
    }
    // 모든 조건 충족 시
    message.textContent = "";
    searchBtn.disabled = false;
    return true;
}

const searchGithubUser = async () => {
    if (!validateGitHubId()) {
        return;
    }
    const id = githubId.value.trim();
    const url = `https://api.github.com/users/${id}`;

    try {
        message.textContent = "사용자 정보를 불러오는 중입니다...";
        profileBox.innerHTML = "";

        const response = await fetch(url);

        if (response.status === 404) {
            message.textContent = "존재하지 않는 사용자입니다.";
            return;
        }
        if (response.status === 403) {
            message.textContent = "접근 권한이 없습니다.";
            return;
        }
        if (!response.ok) {
            throw new Error("API 오류")
        }
        const user = await response.json();
        message.textContent = "";

        profileBox.innerHTML = `
                    <div class="profileBox">
                        <img id="profile" src="" alt="프로필이미지1">
                            <div class="textarea">
                                <h2>${user.login}</h2>
                                <p><strong>이름 : </strong>${user.name || "이름 정보 없음"}</p>
                                <p><strong>소개 : </strong>${user.bio || "소개 정보 없음"}</p>
                                <div class="badge-list">
                                    <span class="badge">팔로워 : ${user.followers}</span>
                                    <span class="badge">팔로잉 : ${user.following}</span>
                                    <span class="badge">저장소 : ${user.public_repos}</span>
                </div>
                <a id="GitHubLink" href="#">GitHub 페이지 이동</a>
            </div>
        </div>
        `
    } catch (error) {
        message.textContent = "사용자 정보를 불러오지 못했습니다."
    }
}

githubId.addEventListener("input",validateGitHubId);

// 버튼을 눌렀을 때 해야하는 일
// 1. 내용이 제대로 입력이 됐는지 확인
// 2. github api 서버에 정보를 요청을 하고 응답을 받아와서 받아와서 화면에 보여줘야 한다.
searchBtn.addEventListener("click", searchGithubUser);