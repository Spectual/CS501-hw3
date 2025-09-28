# CS501-hw3

## Q1 Row & Column Weight Split Layout

```
./SplitScreen
```

## Q2 Box Overlay with Badge

```
./Badge
```

## Q3 LazyColumn with Sticky Headers

```
./Contacts
```

## Q4 Scaffold with TopAppBar, BottomBar, and FAB

```
./Scaffold
```

## Q5 Themed Form with TextFields and Submit Button

```
./Login
```

## **How to Use the Apps**

1. Clone this repository:

```
git clone https://github.com/Spectual/CS501-hw3.git
```

1. Open the root folder in **Android Studio**.
2. Each folder (Badge, Contacts, Login, Scaffold, SplitScreen) is an independent Android project.
3. To run a specific app:
   - Open the folder in Android Studio as a separate project, or
   - Use **File > Open** and choose the app folder you want.
   - Click ▶ Run to launch on emulator or device.

## **Explanation of the Apps**

### **1. SplitScreen**

- **Task:** Layout with Row and Column using weight proportions.
- **Features:**
  - Left column takes 25% width, right column takes 75%.
  - Inside right column: 3 children with ratios 2:3:5.
  - Colored blocks and text show proportional space.

### **2. Badge**

- **Task:** Profile picture with notification badge using Box.
- **Features:**
  - Circular avatar image.
  - Red badge aligned to bottom-right using Modifier.align().
  - Toggle button shows/hides the badge.

### **3. Contacts**

- **Task:** Contact list grouped alphabetically with sticky headers.
- **Features:**
  - LazyColumn with stickyHeader for alphabet headers.
  - 50+ generated contacts.
  - FAB appears after scrolling past 10 items, clicking scrolls to top.

### **4. Scaffold**

- **Task:** App layout with Scaffold.
- **Features:**
  - TopAppBar showing app title.
  - Bottom navigation bar with 3 items: Home, Settings, Profile.
  - Floating Action Button triggers a Snackbar message.
  - Proper innerPadding avoids content overlap.

### **5. Login**

- **Task:** Themed form with validation.

- **Features:**

  - Username and password fields
  - Error message shown if fields are empty on submit.
  - Button styled with Material 3 theme colors.

  

### AI Usage

For this assignment, I used **OpenAI’s ChatGPT (GPT-5)** as a study and support tool.

**How I used AI**

- Explain important Android development concepts.
- I provided sample classroom code and requested **step-by-step explanations** of why certain behaviors occur.
- I shared parts of my own Compose code and asked AI for **suggestions to improve UI clarity and layout**, such as adding padding, background colors, borders, and better text alignment.



- **What I kept**

  

  - I used the **conceptual explanations** and **ui improvement suggestions** to refine my own implementation.
  - I reused short snippets but **rewrote them in my own structure** to fit assignment requirements.

  

- **What I discarded**

  

  - I did not copy AI-generated solutions.

  
