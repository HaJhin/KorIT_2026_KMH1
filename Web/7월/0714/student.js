const loadBtn = document.getElementById("loadBtn");
const addBtn = document.getElementById("addBtn");



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