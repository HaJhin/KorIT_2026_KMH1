// 처음 페이지가 로딩됐을 때 전체 목록이 나오게 하기
const API_URL = "http://localhost:10000/reservation";

// HTML 요소 가져오기
const reservationId = document.querySelector("#reservationId");

// 동물 이름
const petName = document.querySelector("#petName");
// 주인
const ownerName = document.querySelector("ownerName");
// 동물의 종류
const animalType = document.querySelector("#animalType");
// 의사이름
const doctorName = document.querySelector("#doctorName");
// 예약 날짜
const reservationDate = document.querySelector("#reservationDate");
// 상태
const status = document.querySelector("#status");
// 금액
const price = document.querySelector("price");
//등록버튼
const saveBtn = document.querySelector("#saveBtn");
// 취소 버튼
const cancelBtn = document.querySelector("#cancelBtn");
const loadBtn = document.querySelector("#loadBtn");
const reservationList = document.querySelector("#reservationList")

const loadReservations = () => {
    fetch(API_URL)
        .then(res => res.json())
        .then(data => {
            const tbody = document.getElementById("reservationTbody");
            tbody.innerHTML = "";

            if (data.length === 0) {
                tbody.innerHTML = `<tr><td colspan="7">등록된 예약이 없습니다.</td></tr>`;
                return;
            }

            data.forEach(resetvation => {
                // tr 생성
                const tr = document.createElement("tr");
                // 내부에 들어갈 td 항목들을 백틱(Template Literals)으로 작성
                tr.innerHTML = `
                    <td>${reservation.petName}</td>
                    <td>${reservation.ownerName}</td>
                    <td>${reservation.animalType}</td>
                    <td>${reservation.doctorName}</td>
                    <td>${reservation.reservationDate}</td>
                    <td>${reservation.status}</td>
                    <td>${Number(reservation.price).toLocaleString()}원</td>
                `;
                // 생성한 tr을 tbody 안에 추가
                tbody.appendChild(tr);
            })
        })
        .catch(error => {
            console.error("Error",error);
        })
};

loadReservations();