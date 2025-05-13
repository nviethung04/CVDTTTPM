from product import Product

class InventoryManager:
    def update_inventory(self, product: Product, amount: int):
        new_quantity = product.get_quantity() + amount
        product.set_quantity(new_quantity)
        self.log_inventory_change(product)

    def log_inventory_change(self, product: Product):
        print(f"Inventory updated for product: {product.get_product_id()}, "
              f"new quantity: {product.get_quantity()}")
