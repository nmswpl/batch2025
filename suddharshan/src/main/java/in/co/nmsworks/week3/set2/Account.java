package in.co.nmsworks.week3.set2;
/*
int limit():
• Returns the maximum amount that can be withdrawn or deposited at a time.
2. int withdraw(int amount):
• Withdraws the specified amount from the account and returns the updated balance.
• If the withdrawal amount exceeds the available balance or the limit, print an error
message.
3. int deposit(int amount):
 */
public interface Account {
    int limit();
    int withdraw(int amount);
    int deposit(int amount);
}
