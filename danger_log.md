## 1. Redirecting Packages

In accordance with the stipulated requirement, users are able to redirect a package to a different address as long as it has not yet been dispatched for delivery. However, upon investigation, it was discovered that certain circumstances exist wherein the package status, while still in the warehouse, changes to "out for delivery" between the time a user clicks the "change" button and submits the new destination address. Thus, any subsequent attempts to alter the package's destination would be deemed invalid.

To address this issue, an additional check was implemented such that when a user clicks the "submit" button, it verifies that the package has not yet been dispatched for delivery.


## 2. Duplicate Messages

In the event that the last message before a disconnection was from the world, the world would typically not receive an acknowledgment from the UPS. Upon reconnection, the world would resend the message, resulting in duplicate messages being received by the UPS.

To address this issue, the package status for the specific package ID is examined to determine if it has already been delivered. If so, no confirmation emails are sent to the user, and no "Package Arrived" message is sent to Amazon.

## 3. Stuck Shipment

If commands were not successfully sent to the world due to a closed connection, the shipment would remain stuck in its current status.

To prevent this, an acknowledgement confirmation mechanism was introduced such that if the UPS did not receive an acknowledgement from the world after a certain amount of time, the missed message would be resent.

## 4. Sending Confirmation Emails

Errors were encountered when sending confirmation emails to users who had not previously registered on the UPS website upon package arrival.

To address this issue, the user database is searched to determine if the username exists. If it does not, the function of sending a confirmation email is skipped.
