using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class EndCombat : MonoBehaviour
{
    [SerializeField]
    GameObject win;

    [SerializeField]
    GameObject lose;

    [SerializeField]
    Camera mainCamera;
    
    void Start()
    {
        int result = PlayerPrefs.GetInt("Result");

        if (result == 0)
            win.SetActive(true);
        else
        {
            lose.SetActive(true);
            mainCamera.backgroundColor = Color.red;
        }
        StartCoroutine(ChangeScene()); 
    }

    IEnumerator ChangeScene()
    {
        yield return new WaitForSeconds(3f); 
        SceneManager.LoadScene("Hotel");
    }

}
