# Lớp Product
class Product:
    def __init__(self, product_id: str, quantity: int):
        self.product_id = product_id
        self.quantity = quantity

    def __str__(self):
        return f"Sản phẩm [{self.product_id}] có số lượng: {self.quantity}"

# Lớp InventoryLogger
class InventoryLogger:
    def log_inventory_change(self, product: Product):
        print(f"Sản phẩm [{product.product_id}] có số lượng: {product.quantity}")

# Lớp InventoryManager
class InventoryManager:
    def __init__(self, logger: InventoryLogger):
        self.logger = logger

    def update_inventory(self, product: Product, amount: int):
        product.quantity += amount
        self.logger.log_inventory_change(product)

# ------------------------------------
# Kiểm tra chương trình
if __name__ == "__main__":
    # Tạo sản phẩm
    p1 = Product("A101", 50)

    # Tạo logger và manager
    logger = InventoryLogger()
    manager = InventoryManager(logger)

    # Cập nhật số lượng và ghi log
    manager.update_inventory(p1, 20)  # Tăng 20
    manager.update_inventory(p1, -10) # Giảm 10
