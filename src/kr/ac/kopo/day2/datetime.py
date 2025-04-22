from datetime import datetime

orders = [
    {'고객명': '철수', '구매일': '2024-01-01'},
    {'고객명': '영희', '구매일': '2023-10-10'}
]

cutoff = datetime.strptime('2024-03-01', '%Y-%m-%d')

inactive_customers = []

for order in orders:
    name = order['고객명']

    date = datetime.strptime(order['구매일'], '%Y-%m-%d')

    if(cutoff - date).days > 90:
        inactive_customers.append(name)

print(f"이탈 고객: {inactive_customers}")