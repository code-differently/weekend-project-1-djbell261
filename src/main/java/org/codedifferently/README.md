# Mystery Shack — Java

This small Java console app simulates a checkout experience at **“The Dev Group’s Mystery Shack.”**  
It asks for your name and budget, generates a random receipt ID, creates 3 random item prices, applies a random tax rate, then tells you if you can afford the total (or how much you’re short / what your change is).

---

## What this program does

1. Prompts the user for:
    - **Name**
    - **Budget**
2. Prints a “welcome” message.
3. Generates a **random receipt ID** and prints it in a receipt format.
4. Generates **3 random item prices** (between ~$10 and $50) and prints them.
5. Adds them up to a **subtotal**.
6. Generates a **random tax percent** (0%–9%), calculates the final total, and prints it.
7. Compares the final total to your budget and prints either:
    - “You don’t have enough…” + amount needed, OR
    - “You have enough!” + your change

---

## Files / Classes

### `Main.java`
This is the entry point (`main`) of the program.
- Creates a `CalculateTax` object
- Uses a `Scanner` to collect user input
- Calls methods in this order:
    1. `receiptCode(customerName, randomIdCode())`
    2. `itemPrices()` → returns subtotal
    3. `itemTax(subTotal)` → returns total with tax
    4. `canYouAffordIt(total, budget)`

### `RecieptGenerator.java`
This class holds most of the “business logic”:

- **`randomIdCode()`**
    - Creates a random receipt number from **100 to 999**

- **`receiptCode(String name, int id)`**
    - Takes the **first 2 letters of the name**, uppercases them, and prints something like:
        - `DE-472`

- **`itemPrices()`**
    - Generates 3 random item prices (roughly $10–$50)
    - Prints each item and the subtotal
    - Returns the subtotal as a `double`

- **`itemTax(double subTotal)`**
    - Picks a random tax rate from **0 to 9**
    - Calculates tax amount and adds it to the subtotal
    - Prints the tax percent and final total
    - Returns the final total as a `double`

- **`canYouAffordIt(double total, double budget)`**
    - If budget < total → prints how much more you need
    - Else → prints your change

---