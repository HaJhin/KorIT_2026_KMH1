// 요소 추출
const searchInput = document.getElementById("searchInput");
const searchBtn = document.getElementById("searchBtn");
const allBtn = document.getElementById("allBtn");
const message = document.getElementById("message");
const count = document.getElementById("count");
const productList = document.getElementById("productList");
const state = document.getElementById("state");

// 검색어 유효성 검사
const validateInput = () => {
    const keyword = searchInput.value.trim();
    let regex = /^[A-Za-z0-9]+$/;

    if (keyword === "") {
        message.textContent = "검색어를 입력하세요";
        return false;
    }
    if (keyword.length < 2) {
        message.textContent = "검색어는 2글자 이상 입력하세요.";
        return false;
    }
    if (!regex.test(keyword)) {
        message.textContent = "특수문자를 입력할 수 없습니다.";
        return false;
    }
    message.textContent = "";
    return true;
}

// 상품 카드 만들기
const createProductCard = (product) => {
    const stockStatus = product.stock < 10
        ? `<span class="stock-low">재고 부족</span>`
        : `<span class="stock-normal">재고 정상</span>`;

    return `
        <div class="product-card">
            <img src="${product.thumbnail}" alt="상품이미지">
            <div class="textarea">
                <h2>${product.title}</h2>
                <p><strong>카테고리 : </strong>${product.category}</p>
                <p><strong>가격 : </strong>${product.price}</p>
                <p><strong>할인율 : </strong>${product.discountPercentage}%</p>
                <p><strong>평점 : </strong>${product.rating}</p>
                <p><strong>재고 : </strong>${product.stock}</p>
                ${stockStatus}
            </div>
        </div>
    `;
};

// 모든 상품 출력
const fetchAllProducts = async () => {
    const url = `https://dummyjson.com/products?limit=30`;

    try {
        message.textContent = "";
        count.textContent = "";

        const response = await fetch(url);

        if (!response.ok) {
            throw new Error("API 오류");
        }

        const data = await response.json();
        count.textContent = `상품개수: ${data.products.length}개`;

        productList.innerHTML = "";
        for (let i = 0; i < data.products.length; i++) {
            productList.innerHTML += createProductCard(data.products[i]);
        }
    } catch (error) {
        alert("불러오기 실패");
    }
};

// 키워드와 일치한 상품 찾아와서 출력
const searchProducts = async () => {
    if (!validateInput()) {
        return;
    }

    const keyword = searchInput.value.trim();
    const url = `https://dummyjson.com/products/search?q=${keyword}`;

    try {
        productList.innerHTML = "";
        const response = await fetch(url);

        if (!response.ok) {
            throw new Error("API 오류");
        }

        const data = await response.json();

        if (data.products.length === 0) {
            state.innerHTML = `<span class="error">검색 결과가 없습니다.</span>`;
            count.textContent = `상품개수: ${data.products.length}개`
            return;
        }

        message.textContent = "";
        count.textContent = `상품개수: ${data.products.length}개`;
        state.innerHTML = `<span class="success">검색 성공</span>`;
        for (let i = 0; i < data.products.length; i++) {
            productList.innerHTML += createProductCard(data.products[i]);
        }
    } catch (error) {
        alert("불러오기 실패");
    }
};

// 
const showAllProducts = () => {
    searchInput.value = "";
    message.textContent = "";
    count.textContent = "";
    fetchAllProducts();
};

searchInput.addEventListener("input", validateInput);
allBtn.addEventListener("click", showAllProducts);
searchBtn.addEventListener("click", searchProducts);

showAllProducts();

