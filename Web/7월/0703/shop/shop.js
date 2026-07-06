let products = [];
let cartCount = 0;

// 상품목록, 검색창, 카테고리, 장바구니 개수
const productList = document.getElementById();
const searchBox = document.getElementById();
const cartegory = document.getElementById();
const cartCountSpan = document.getElementById();

function loadProducts(){
    productList.innerHTML = `<div class="message">상품 정보를 불러오는 중입니다...</div>`;

    fetch("https://dummyjson.com/products")
    .then(res => res.json())
    .then(data => {
        products = data.products;
        renderProducts();
    })
}