import os
import shutil
from datetime import datetime


GITHUB_REPO_PATH = r"C:\Users\Admin\Dsa_practice" 
DEFAULT_LANGUAGE = "java"  # or "py", "cpp"


def get_solution_template(link, filename):
    ext = filename.split('.')[-1]
    if ext == "java":
        return f"// Problem: {link}\n// Uploaded on: {datetime.now().strftime('%Y-%m-%d')}\n\n"
    elif ext == "py":
        return f"# Problem: {link}\n# Uploaded on: {datetime.now().strftime('%Y-%m-%d')}\n\n"
    elif ext == "cpp":
        return f"// Problem: {link}\n// Uploaded on: {datetime.now().strftime('%Y-%m-%d')}\n\n"
    else:
        return ""

def main():
    print("Auto LeetCode Uploader to GitHub")
    problem_title = input("Problem title (e.g., Two Sum): ").strip()
    leetcode_link = input("LeetCode link: ").strip()
    category = input("Category (e.g., Arrays, Strings): ").strip()
    filename = input(f"File name (e.g., two_sum.{DEFAULT_LANGUAGE}): ").strip()

    source_path = os.path.abspath(filename)
    if not os.path.exists(source_path):
        print("Source file not found.")
        return

    category_folder = os.path.join(GITHUB_REPO_PATH, category)
    os.makedirs(category_folder, exist_ok=True)

    dest_path = os.path.join(category_folder, filename)

    with open(source_path, "r", encoding="utf-8") as f:
        content = f.read()

    with open(dest_path, "w", encoding="utf-8") as f:
        f.write(get_solution_template(leetcode_link, filename) + content)

    os.remove(source_path)

    os.chdir(GITHUB_REPO_PATH)

    os.system("git add .")
    os.system(f'git commit -m "Added {problem_title} in {category}"')
    os.system("git push")

    print("Successfully pushed to GitHub!")

if __name__ == "__main__":
    main()
