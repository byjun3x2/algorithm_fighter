orders = {
    '김철수': {'김치찌개': 1, '불고기': 2},
    '이영희': {'된장찌개': 1, '비빔밥': 1},
}

for customer, menu in orders.items():
    print(f"{customer}님의 주문 내역:")

    for food, quantity in menu.items():
        print(f"{food}: {quantity}개")

    print()