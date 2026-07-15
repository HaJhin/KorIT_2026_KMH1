const loadBtn = document.getElementById("loadBtn");
const addBtn = document.getElementById("addBtn");

// 수강생 전체조회
loadBtn.addEventListener("click", () => {
    const studentList = document.getElementById("studentList");
    studentList.innerHTML = "";

    fetch(`http://localhost:10000/api/students`)
        .then(res => res.json())
        .then(data => {
            if (data.length === 0) {
                studentList.innerHTML = `
                <tr>
                    <td colspan="4" class="empty">등록된 수강생이 없습니다.</td>
                </tr>
            `;
                return;
            }
            // 
            data.forEach(student => {
                const tr = document.createElement("tr");
                tr.innerHTML = `
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.course}</td>
                <td>${student.email}</td>`;

                studentList.appendChild(tr);
            });
        })
        .catch(err => {
            console.error("데이터 조회 실패:", err);
            const message = document.getElementById("message");
            if (message) message.textContent = "수강생 목록을 가져오는 데 실패했습니다.";
        });
})

// 수강생 등록
addBtn.addEventListener("click", () => {
    const nameI = document.getElementById("name").value;
    const courseI = document.getElementById("course").value;
    const emailI = document.getElementById("email").value;
    const message = document.getElementById("message");

    const studentData = {
        name: nameI,
        course: courseI,
        email: emailI
    };

    fetch(`http://localhost:10000/api/students`, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(studentData)
    })
        .then(res => res.json())
        .then(data => {
            message.style.color = "#10b981";
            message.textContent = `${data.name} 수강생 번호 [${data.id}]로 등록.`;

            document.getElementById("name").value = "";
            document.getElementById("course").value = "";
            document.getElementById("email").value = "";
        })
        .catch(err => {
            console.error("등록 오류:", err);
            message.style.color = "#e11d48";
            message.textContent = "수강생 등록 중 오류 발생.";
        });

})